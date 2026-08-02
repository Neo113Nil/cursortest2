package com.google.gson.internal;

import defpackage.EvgenDiagnostic$WebViewType;
import defpackage.aqy;
import defpackage.ny61;
import defpackage.rvr;
import defpackage.xfo;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectStreamException;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.Set;

/* loaded from: classes11.dex */
public final class LinkedTreeMap<K, V> extends AbstractMap<K, V> implements Serializable {
    public static final rvr a = new rvr(10);
    private final boolean allowNullValues;
    private final Comparator<? super K> comparator;
    private a entrySet;
    final aqy header;
    private b keySet;
    int modCount;
    aqy root;
    int size;

    public LinkedTreeMap(boolean z) {
        this.size = 0;
        this.modCount = 0;
        this.comparator = a;
        this.allowNullValues = z;
        this.header = new aqy(z);
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException {
        throw new InvalidObjectException("Deserialization is unsupported");
    }

    private Object writeReplace() throws ObjectStreamException {
        return new LinkedHashMap(this);
    }

    public final aqy a(Object obj, boolean z) {
        int i;
        aqy aqyVar;
        Comparator<? super K> comparator = this.comparator;
        aqy aqyVar2 = this.root;
        rvr rvrVar = a;
        if (aqyVar2 != null) {
            Comparable comparable = comparator == rvrVar ? (Comparable) obj : null;
            while (true) {
                EvgenDiagnostic$WebViewType evgenDiagnostic$WebViewType = (Object) aqyVar2.y;
                i = comparable != null ? comparable.compareTo(evgenDiagnostic$WebViewType) : comparator.compare(obj, evgenDiagnostic$WebViewType);
                if (i == 0) {
                    return aqyVar2;
                }
                aqy aqyVar3 = i < 0 ? aqyVar2.b : aqyVar2.c;
                if (aqyVar3 == null) {
                    break;
                }
                aqyVar2 = aqyVar3;
            }
        } else {
            i = 0;
        }
        aqy aqyVar4 = aqyVar2;
        if (!z) {
            return null;
        }
        aqy aqyVar5 = this.header;
        if (aqyVar4 != null) {
            aqyVar = new aqy(this.allowNullValues, aqyVar4, obj, aqyVar5, aqyVar5.x);
            if (i < 0) {
                aqyVar4.b = aqyVar;
            } else {
                aqyVar4.c = aqyVar;
            }
            b(aqyVar4, true);
        } else {
            if (comparator == rvrVar && !(obj instanceof Comparable)) {
                xfo.h(obj.getClass().getName().concat(" is not Comparable"));
                return null;
            }
            aqyVar = new aqy(this.allowNullValues, aqyVar4, obj, aqyVar5, aqyVar5.x);
            this.root = aqyVar;
        }
        this.size++;
        this.modCount++;
        return aqyVar;
    }

    public final void b(aqy aqyVar, boolean z) {
        while (aqyVar != null) {
            aqy aqyVar2 = aqyVar.b;
            aqy aqyVar3 = aqyVar.c;
            int i = aqyVar2 != null ? aqyVar2.B : 0;
            int i2 = aqyVar3 != null ? aqyVar3.B : 0;
            int i3 = i - i2;
            if (i3 == -2) {
                aqy aqyVar4 = aqyVar3.b;
                aqy aqyVar5 = aqyVar3.c;
                int i4 = (aqyVar4 != null ? aqyVar4.B : 0) - (aqyVar5 != null ? aqyVar5.B : 0);
                if (i4 == -1 || (i4 == 0 && !z)) {
                    g(aqyVar);
                } else {
                    h(aqyVar3);
                    g(aqyVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 2) {
                aqy aqyVar6 = aqyVar2.b;
                aqy aqyVar7 = aqyVar2.c;
                int i5 = (aqyVar6 != null ? aqyVar6.B : 0) - (aqyVar7 != null ? aqyVar7.B : 0);
                if (i5 == 1 || (i5 == 0 && !z)) {
                    h(aqyVar);
                } else {
                    g(aqyVar2);
                    h(aqyVar);
                }
                if (z) {
                    return;
                }
            } else if (i3 == 0) {
                aqyVar.B = i + 1;
                if (z) {
                    return;
                }
            } else {
                aqyVar.B = Math.max(i, i2) + 1;
                if (!z) {
                    return;
                }
            }
            aqyVar = aqyVar.a;
        }
    }

    public final void c(aqy aqyVar, boolean z) {
        aqy aqyVar2;
        aqy aqyVar3;
        int i;
        if (z) {
            aqy aqyVar4 = aqyVar.x;
            aqyVar4.w = aqyVar.w;
            aqyVar.w.x = aqyVar4;
        }
        aqy aqyVar5 = aqyVar.b;
        aqy aqyVar6 = aqyVar.c;
        aqy aqyVar7 = aqyVar.a;
        int i2 = 0;
        if (aqyVar5 == null || aqyVar6 == null) {
            if (aqyVar5 != null) {
                f(aqyVar, aqyVar5);
                aqyVar.b = null;
            } else if (aqyVar6 != null) {
                f(aqyVar, aqyVar6);
                aqyVar.c = null;
            } else {
                f(aqyVar, null);
            }
            b(aqyVar7, false);
            this.size--;
            this.modCount++;
            return;
        }
        if (aqyVar5.B > aqyVar6.B) {
            aqy aqyVar8 = aqyVar5.c;
            while (true) {
                aqy aqyVar9 = aqyVar8;
                aqyVar3 = aqyVar5;
                aqyVar5 = aqyVar9;
                if (aqyVar5 == null) {
                    break;
                } else {
                    aqyVar8 = aqyVar5.c;
                }
            }
        } else {
            aqy aqyVar10 = aqyVar6.b;
            while (true) {
                aqyVar2 = aqyVar6;
                aqyVar6 = aqyVar10;
                if (aqyVar6 == null) {
                    break;
                } else {
                    aqyVar10 = aqyVar6.b;
                }
            }
            aqyVar3 = aqyVar2;
        }
        c(aqyVar3, false);
        aqy aqyVar11 = aqyVar.b;
        if (aqyVar11 != null) {
            i = aqyVar11.B;
            aqyVar3.b = aqyVar11;
            aqyVar11.a = aqyVar3;
            aqyVar.b = null;
        } else {
            i = 0;
        }
        aqy aqyVar12 = aqyVar.c;
        if (aqyVar12 != null) {
            i2 = aqyVar12.B;
            aqyVar3.c = aqyVar12;
            aqyVar12.a = aqyVar3;
            aqyVar.c = null;
        }
        aqyVar3.B = Math.max(i, i2) + 1;
        f(aqyVar, aqyVar3);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final void clear() {
        this.root = null;
        this.size = 0;
        this.modCount++;
        aqy aqyVar = this.header;
        aqyVar.x = aqyVar;
        aqyVar.w = aqyVar;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean containsKey(Object obj) {
        aqy aqyVar = null;
        if (obj != null) {
            try {
                aqyVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return aqyVar != null;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        a aVar = this.entrySet;
        if (aVar != null) {
            return aVar;
        }
        a aVar2 = new a(this);
        this.entrySet = aVar2;
        return aVar2;
    }

    public final void f(aqy aqyVar, aqy aqyVar2) {
        aqy aqyVar3 = aqyVar.a;
        aqyVar.a = null;
        if (aqyVar2 != null) {
            aqyVar2.a = aqyVar3;
        }
        if (aqyVar3 == null) {
            this.root = aqyVar2;
        } else if (aqyVar3.b == aqyVar) {
            aqyVar3.b = aqyVar2;
        } else {
            aqyVar3.c = aqyVar2;
        }
    }

    public final void g(aqy aqyVar) {
        aqy aqyVar2 = aqyVar.b;
        aqy aqyVar3 = aqyVar.c;
        aqy aqyVar4 = aqyVar3.b;
        aqy aqyVar5 = aqyVar3.c;
        aqyVar.c = aqyVar4;
        if (aqyVar4 != null) {
            aqyVar4.a = aqyVar;
        }
        f(aqyVar, aqyVar3);
        aqyVar3.b = aqyVar;
        aqyVar.a = aqyVar3;
        int max = Math.max(aqyVar2 != null ? aqyVar2.B : 0, aqyVar4 != null ? aqyVar4.B : 0) + 1;
        aqyVar.B = max;
        aqyVar3.B = Math.max(max, aqyVar5 != null ? aqyVar5.B : 0) + 1;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x000f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object get(Object obj) {
        aqy aqyVar;
        if (obj != null) {
            try {
                aqyVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aqyVar == null) {
                return aqyVar.A;
            }
            return null;
        }
        aqyVar = null;
        if (aqyVar == null) {
        }
    }

    public final void h(aqy aqyVar) {
        aqy aqyVar2 = aqyVar.b;
        aqy aqyVar3 = aqyVar.c;
        aqy aqyVar4 = aqyVar2.b;
        aqy aqyVar5 = aqyVar2.c;
        aqyVar.b = aqyVar5;
        if (aqyVar5 != null) {
            aqyVar5.a = aqyVar;
        }
        f(aqyVar, aqyVar2);
        aqyVar2.c = aqyVar;
        aqyVar.a = aqyVar2;
        int max = Math.max(aqyVar3 != null ? aqyVar3.B : 0, aqyVar5 != null ? aqyVar5.B : 0) + 1;
        aqyVar.B = max;
        aqyVar2.B = Math.max(max, aqyVar4 != null ? aqyVar4.B : 0) + 1;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Set keySet() {
        b bVar = this.keySet;
        if (bVar != null) {
            return bVar;
        }
        b bVar2 = new b(this);
        this.keySet = bVar2;
        return bVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            ny61.t("key == null");
            return null;
        }
        if (obj2 == null && !this.allowNullValues) {
            ny61.t("value == null");
            return null;
        }
        aqy a2 = a(obj, true);
        Object obj3 = a2.A;
        a2.A = obj2;
        return obj3;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0015 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0012  */
    @Override // java.util.AbstractMap, java.util.Map
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object remove(Object obj) {
        aqy aqyVar;
        if (obj != null) {
            try {
                aqyVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
            if (aqyVar != null) {
                c(aqyVar, true);
            }
            if (aqyVar == null) {
                return aqyVar.A;
            }
            return null;
        }
        aqyVar = null;
        if (aqyVar != null) {
        }
        if (aqyVar == null) {
        }
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int size() {
        return this.size;
    }

    public LinkedTreeMap() {
        this(true);
    }
}
