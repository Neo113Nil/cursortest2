package com.squareup.moshi;

import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.ny61;
import defpackage.xfo;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* loaded from: classes.dex */
final class LinkedHashTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final Comparator a = new AnonymousClass1();
    private LinkedHashTreeMap<K, V>.EntrySet entrySet;
    private LinkedHashTreeMap<K, V>.KeySet keySet;
    int size = 0;
    int modCount = 0;
    final Comparator<? super K> comparator = a;
    final Node<K, V> header = new Node<>();
    Node<K, V>[] table = new Node[16];
    int threshold = 12;

    public static final class AvlBuilder<K, V> {
        public Node a;
        public int b;
        public int c;
        public int d;

        public final void a(Node node) {
            node.c = null;
            node.a = null;
            node.b = null;
            node.B = 1;
            int i = this.b;
            if (i > 0) {
                int i2 = this.d;
                if ((i2 & 1) == 0) {
                    this.d = i2 + 1;
                    this.b = i - 1;
                    this.c++;
                }
            }
            node.a = this.a;
            this.a = node;
            int i3 = this.d;
            int i4 = i3 + 1;
            this.d = i4;
            int i5 = this.b;
            if (i5 > 0 && (i4 & 1) == 0) {
                this.d = i3 + 2;
                this.b = i5 - 1;
                this.c++;
            }
            int i6 = 4;
            while (true) {
                int i7 = i6 - 1;
                if ((this.d & i7) != i7) {
                    return;
                }
                int i8 = this.c;
                if (i8 == 0) {
                    Node node2 = this.a;
                    Node node3 = node2.a;
                    Node node4 = node3.a;
                    node3.a = node4.a;
                    this.a = node3;
                    node3.b = node4;
                    node3.c = node2;
                    node3.B = node2.B + 1;
                    node4.a = node3;
                    node2.a = node3;
                } else if (i8 == 1) {
                    Node node5 = this.a;
                    Node node6 = node5.a;
                    this.a = node6;
                    node6.c = node5;
                    node6.B = node5.B + 1;
                    node5.a = node6;
                    this.c = 0;
                } else if (i8 == 2) {
                    this.c = 0;
                }
                i6 *= 2;
            }
        }
    }

    public static class AvlIterator<K, V> {
        public Node a;

        public Node<K, V> next() {
            Node<K, V> node = this.a;
            if (node == null) {
                return null;
            }
            Node node2 = node.a;
            node.a = null;
            Node node3 = node.c;
            while (true) {
                Node node4 = node2;
                node2 = node3;
                if (node2 == null) {
                    this.a = node4;
                    return node;
                }
                node2.a = node4;
                node3 = node2.b;
            }
        }
    }

    /* loaded from: classes11.dex */
    public final class KeySet extends AbstractSet<K> {

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$KeySet$1, reason: invalid class name */
        public class AnonymousClass1 extends LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<K> {
            @Override // java.util.Iterator
            public K next() {
                return (K) a().y;
            }
        }

        public KeySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean contains(Object obj) {
            return LinkedHashTreeMap.this.containsKey(obj);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<K> iterator() {
            return new AnonymousClass1();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public boolean remove(Object obj) {
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            Node node = null;
            if (obj != null) {
                try {
                    node = linkedHashTreeMap.a(obj, false);
                } catch (ClassCastException unused) {
                }
            }
            if (node != null) {
                linkedHashTreeMap.c(node, true);
            }
            return node != null;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }
    }

    public abstract class LinkedTreeMapIterator<T> implements Iterator<T> {
        public Node a;
        public Node b = null;
        public int c;

        public LinkedTreeMapIterator() {
            this.a = LinkedHashTreeMap.this.header.w;
            this.c = LinkedHashTreeMap.this.modCount;
        }

        public final Node a() {
            Node<K, V> node = this.a;
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            if (node == linkedHashTreeMap.header) {
                ny61.p();
                return null;
            }
            if (linkedHashTreeMap.modCount != this.c) {
                ny61.y();
                return null;
            }
            this.a = node.w;
            this.b = node;
            return node;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a != LinkedHashTreeMap.this.header;
        }

        @Override // java.util.Iterator
        public final void remove() {
            Node node = this.b;
            if (node == null) {
                ny61.k();
                return;
            }
            LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
            linkedHashTreeMap.c(node, true);
            this.b = null;
            this.c = linkedHashTreeMap.modCount;
        }
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final Node a(Object obj, boolean z) {
        int i;
        Node<K, V> node;
        boolean z2;
        Node<K, V> node2;
        Node<K, V> node3;
        Comparator<? super K> comparator = this.comparator;
        Node<K, V>[] nodeArr = this.table;
        int hashCode = obj.hashCode();
        int i2 = hashCode ^ ((hashCode >>> 20) ^ (hashCode >>> 12));
        int i3 = ((i2 >>> 7) ^ i2) ^ (i2 >>> 4);
        boolean z3 = true;
        int length = i3 & (nodeArr.length - 1);
        Node<K, V> node4 = nodeArr[length];
        Comparator<? super K> comparator2 = a;
        if (node4 != null) {
            Comparable comparable = comparator == comparator2 ? (Comparable) obj : null;
            while (true) {
                EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = (Object) node4.y;
                i = comparable != null ? comparable.compareTo(evgenDiagnostic$WebViewType) : comparator.compare(obj, evgenDiagnostic$WebViewType);
                if (i == 0) {
                    return node4;
                }
                Node<K, V> node5 = i < 0 ? node4.b : node4.c;
                if (node5 == null) {
                    break;
                }
                node4 = node5;
            }
        } else {
            i = 0;
        }
        if (!z) {
            return null;
        }
        Node<K, V> node6 = this.header;
        if (node4 != null) {
            node = new Node<>(node4, obj, i3, node6, node6.x);
            if (i < 0) {
                node4.b = node;
            } else {
                node4.c = node;
            }
            b(node4, true);
        } else {
            if (comparator == comparator2 && !(obj instanceof Comparable)) {
                xfo.h(obj.getClass().getName().concat(" is not Comparable"));
                return null;
            }
            node = new Node<>(node4, obj, i3, node6, node6.x);
            nodeArr[length] = node;
        }
        int i4 = this.size;
        this.size = i4 + 1;
        if (i4 > this.threshold) {
            Node<K, V>[] nodeArr2 = this.table;
            int length2 = nodeArr2.length;
            int i5 = length2 * 2;
            Node<K, V>[] nodeArr3 = new Node[i5];
            AvlIterator avlIterator = new AvlIterator();
            AvlBuilder avlBuilder = new AvlBuilder();
            AvlBuilder avlBuilder2 = new AvlBuilder();
            int i6 = 0;
            while (i6 < length2) {
                Node<K, V> node7 = nodeArr2[i6];
                if (node7 == null) {
                    z2 = z3;
                } else {
                    Node<K, V> node8 = null;
                    for (Node<K, V> node9 = node7; node9 != null; node9 = node9.b) {
                        node9.a = node8;
                        node8 = node9;
                    }
                    avlIterator.a = node8;
                    z2 = z3;
                    int i7 = 0;
                    int i8 = 0;
                    while (true) {
                        Node<K, V> next = avlIterator.next();
                        if (next == null) {
                            break;
                        }
                        if ((next.z & length2) == 0) {
                            i7++;
                        } else {
                            i8++;
                        }
                    }
                    avlBuilder.b = ((Integer.highestOneBit(i7) * 2) - 1) - i7;
                    avlBuilder.d = 0;
                    avlBuilder.c = 0;
                    avlBuilder.a = null;
                    avlBuilder2.b = ((Integer.highestOneBit(i8) * 2) - 1) - i8;
                    avlBuilder2.d = 0;
                    avlBuilder2.c = 0;
                    avlBuilder2.a = null;
                    Node<K, V> node10 = null;
                    while (node7 != null) {
                        node7.a = node10;
                        Node<K, V> node11 = node7;
                        node7 = node7.b;
                        node10 = node11;
                    }
                    avlIterator.a = node10;
                    while (true) {
                        Node<K, V> next2 = avlIterator.next();
                        if (next2 == null) {
                            break;
                        }
                        if ((next2.z & length2) == 0) {
                            avlBuilder.a(next2);
                        } else {
                            avlBuilder2.a(next2);
                        }
                    }
                    if (i7 > 0) {
                        node2 = avlBuilder.a;
                        if (node2.a != null) {
                            ny61.k();
                            return null;
                        }
                    } else {
                        node2 = null;
                    }
                    nodeArr3[i6] = node2;
                    int i9 = i6 + length2;
                    if (i8 > 0) {
                        node3 = avlBuilder2.a;
                        if (node3.a != null) {
                            ny61.k();
                            return null;
                        }
                    } else {
                        node3 = null;
                    }
                    nodeArr3[i9] = node3;
                }
                i6++;
                z3 = z2;
            }
            this.table = nodeArr3;
            this.threshold = (i5 / 4) + (i5 / 2);
        }
        this.modCount++;
        return node;
    }

    public final void b(Node node, boolean z) {
        while (node != null) {
            Node node2 = node.b;
            Node node3 = node.c;
            int i = node2 != null ? node2.B : 0;
            int i2 = node3 != null ? node3.B : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                Node node4 = node3.b;
                Node node5 = node3.c;
                int i4 = (node4 != null ? node4.B : 0) - (node5 != null ? node5.B : 0);
                if (i4 != -1 && (i4 != 0 || z)) {
                    h(node3);
                }
                g(node);
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                Node node6 = node2.b;
                Node node7 = node2.c;
                int i5 = (node6 != null ? node6.B : 0) - (node7 != null ? node7.B : 0);
                if (i5 != 1 && (i5 != 0 || z)) {
                    g(node2);
                }
                h(node);
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                node.B = i + 1;
                if (z) {
                    return;
                }
            } else {
                node.B = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            node = node.a;
        }
    }

    public final void c(Node node, boolean z) {
        int i;
        if (z) {
            Node node2 = node.x;
            node2.w = node.w;
            node.w.x = node2;
            node.x = null;
            node.w = null;
        }
        Node node3 = node.b;
        Node node4 = node.c;
        Node node5 = node.a;
        int i2 = 0;
        if (node3 == null || node4 == null) {
            if (node3 != null) {
                f(node, node3);
                node.b = null;
            } else if (node4 != null) {
                f(node, node4);
                node.c = null;
            } else {
                f(node, null);
            }
            b(node5, false);
            this.size--;
            this.modCount++;
            return;
        }
        Node<K, V> last = node3.B > node4.B ? node3.last() : node4.first();
        c(last, false);
        Node node6 = node.b;
        if (node6 != null) {
            i = node6.B;
            last.b = node6;
            node6.a = last;
            node.b = null;
        } else {
            i = 0;
        }
        Node node7 = node.c;
        if (node7 != null) {
            i2 = node7.B;
            last.c = node7;
            node7.a = last;
            node.c = null;
        }
        last.B = Math.max(i, i2) + 1;
        f(node, last);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public void clear() {
        Arrays.fill(this.table, (Object) null);
        this.size = 0;
        this.modCount++;
        Node<K, V> node = this.header;
        Node<K, V> node2 = node.w;
        while (node2 != node) {
            Node<K, V> node3 = node2.w;
            node2.x = null;
            node2.w = null;
            node2 = node3;
        }
        node.x = node;
        node.w = node;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public boolean containsKey(Object obj) {
        Node node = null;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return node != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        LinkedHashTreeMap<K, V>.EntrySet entrySet = this.entrySet;
        if (entrySet != null) {
            return entrySet;
        }
        LinkedHashTreeMap<K, V>.EntrySet entrySet2 = new EntrySet();
        this.entrySet = entrySet2;
        return entrySet2;
    }

    public final void f(Node node, Node node2) {
        Node node3 = node.a;
        node.a = null;
        if (node2 != null) {
            node2.a = node3;
        }
        if (node3 == null) {
            int i = node.z;
            ((Node<K, V>[]) this.table)[i & (r2.length - 1)] = node2;
        } else if (node3.b == node) {
            node3.b = node2;
        } else {
            node3.c = node2;
        }
    }

    public final void g(Node node) {
        Node node2 = node.b;
        Node node3 = node.c;
        Node node4 = node3.b;
        Node node5 = node3.c;
        node.c = node4;
        if (node4 != null) {
            node4.a = node;
        }
        f(node, node3);
        node3.b = node;
        node.a = node3;
        int max = Math.max(node2 != null ? node2.B : 0, node4 != null ? node4.B : 0) + 1;
        node.B = max;
        node3.B = Math.max(max, node5 != null ? node5.B : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V get(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node == null) {
                return (V) node.A;
            }
            return null;
        }
        node = null;
        if (node == null) {
        }
    }

    public final void h(Node node) {
        Node node2 = node.b;
        Node node3 = node.c;
        Node node4 = node2.b;
        Node node5 = node2.c;
        node.b = node5;
        if (node5 != null) {
            node5.a = node;
        }
        f(node, node2);
        node2.c = node;
        node.a = node2;
        int max = Math.max(node3 != null ? node3.B : 0, node5 != null ? node5.B : 0) + 1;
        node.B = max;
        node2.B = Math.max(max, node4 != null ? node4.B : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public Set<K> keySet() {
        LinkedHashTreeMap<K, V>.KeySet keySet = this.keySet;
        if (keySet != null) {
            return keySet;
        }
        LinkedHashTreeMap<K, V>.KeySet keySet2 = new KeySet();
        this.keySet = keySet2;
        return keySet2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public V put(K k, V v) {
        if (k == null) {
            ny61.t("key == null");
            return null;
        }
        Node a2 = a(k, true);
        V v2 = (V) a2.A;
        a2.A = v;
        return v2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public V remove(Object obj) {
        Node node;
        if (obj != null) {
            try {
                node = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (node != null) {
                c(node, true);
            }
            if (node == null) {
                return (V) node.A;
            }
            return null;
        }
        node = null;
        if (node != null) {
        }
        if (node == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public int size() {
        return this.size;
    }

    public final class EntrySet extends AbstractSet<Map.Entry<K, V>> {
        public EntrySet() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public void clear() {
            LinkedHashTreeMap.this.clear();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002b A[RETURN] */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean contains(Object obj) {
            Node a;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Node node = null;
                if (key != null) {
                    try {
                        a = linkedHashTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.A) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        node = a;
                    }
                    if (node == null) {
                        return true;
                    }
                }
                a = null;
                if (a != null) {
                    node = a;
                }
                if (node == null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
        public Iterator<Map.Entry<K, V>> iterator() {
            return new AnonymousClass1();
        }

        /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public boolean remove(Object obj) {
            Node a;
            Object obj2;
            Object value;
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                LinkedHashTreeMap linkedHashTreeMap = LinkedHashTreeMap.this;
                Node node = null;
                if (key != null) {
                    try {
                        a = linkedHashTreeMap.a(key, false);
                    } catch (ClassCastException unused) {
                    }
                    if (a != null && ((obj2 = a.A) == (value = entry.getValue()) || (obj2 != null && obj2.equals(value)))) {
                        node = a;
                    }
                    if (node != null) {
                        linkedHashTreeMap.c(node, true);
                        return true;
                    }
                }
                a = null;
                if (a != null) {
                    node = a;
                }
                if (node != null) {
                }
            }
            return false;
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
        public int size() {
            return LinkedHashTreeMap.this.size;
        }

        /* renamed from: com.squareup.moshi.LinkedHashTreeMap$EntrySet$1, reason: invalid class name */
        public class AnonymousClass1 extends LinkedHashTreeMap<K, V>.LinkedTreeMapIterator<Map.Entry<K, V>> {
            @Override // java.util.Iterator
            public Map.Entry<K, V> next() {
                return a();
            }
        }
    }

    /* renamed from: com.squareup.moshi.LinkedHashTreeMap$1, reason: invalid class name */
    public class AnonymousClass1 implements Comparator<Comparable> {
        @Override // java.util.Comparator
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }
    }

    public static final class Node<K, V> implements Map.Entry<K, V> {
        public Object A;
        public int B;
        public Node a;
        public Node b;
        public Node c;
        public Node w;
        public Node x;
        public final Object y;
        public final int z;

        public Node(Node node, Object obj, int i, Node node2, Node node3) {
            this.a = node;
            this.y = obj;
            this.z = i;
            this.B = 1;
            this.w = node2;
            this.x = node3;
            node3.w = this;
            node2.x = this;
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj instanceof Map.Entry) {
                Map.Entry entry = (Map.Entry) obj;
                Object obj2 = this.y;
                if (obj2 != null ? obj2.equals(entry.getKey()) : entry.getKey() == null) {
                    Object obj3 = this.A;
                    if (obj3 == null) {
                        if (entry.getValue() == null) {
                            return true;
                        }
                    } else if (obj3.equals(entry.getValue())) {
                        return true;
                    }
                }
            }
            return false;
        }

        public Node<K, V> first() {
            Node<K, V> node = this.b;
            while (true) {
                Node<K, V> node2 = node;
                Node<K, V> node3 = this;
                this = node2;
                if (this == null) {
                    return node3;
                }
                node = this.b;
            }
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            return (K) this.y;
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            return (V) this.A;
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            Object obj = this.y;
            int hashCode = obj == null ? 0 : obj.hashCode();
            Object obj2 = this.A;
            return hashCode ^ (obj2 != null ? obj2.hashCode() : 0);
        }

        public Node<K, V> last() {
            Node<K, V> node = this.c;
            while (true) {
                Node<K, V> node2 = node;
                Node<K, V> node3 = this;
                this = node2;
                if (this == null) {
                    return node3;
                }
                node = this.c;
            }
        }

        @Override // java.util.Map.Entry
        public V setValue(V v) {
            V v2 = (V) this.A;
            this.A = v;
            return v2;
        }

        public String toString() {
            return this.y + "=" + this.A;
        }

        public Node() {
            this.y = null;
            this.z = -1;
            this.x = this;
            this.w = this;
        }
    }
}
