package com.yandex.div.storage.templates;

import defpackage.jl40;
import defpackage.unr0;
import java.util.List;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\br\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/templates/b;", "", "a", "b", "Lcom/yandex/div/storage/templates/b$a;", "Lcom/yandex/div/storage/templates/b$b;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
interface b {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0015"}, d2 = {"Lcom/yandex/div/storage/templates/b$a;", "Lcom/yandex/div/storage/templates/b;", "", "", "ids", "b", "(Ljava/util/List;)Ljava/util/List;", "g", "(Ljava/util/List;)Ljava/lang/String;", "", "f", "(Ljava/util/List;)I", "", "other", "", "c", "(Ljava/util/List;Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "e", "()Ljava/util/List;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements b {

        /* renamed from: a, reason: from kotlin metadata */
        private final List<String> ids;

        private /* synthetic */ a(List list) {
            this.ids = list;
        }

        public static final /* synthetic */ a a(List list) {
            return new a(list);
        }

        public static List<String> b(List<String> list) {
            return list;
        }

        public static boolean c(List<String> list, Object obj) {
            return (obj instanceof a) && jl40.l(list, ((a) obj).ids);
        }

        public static final boolean d(List<String> list, List<String> list2) {
            return jl40.l(list, list2);
        }

        public static int f(List<String> list) {
            return list.hashCode();
        }

        public static String g(List<String> list) {
            return "Collection(ids=" + list + ')';
        }

        public final List<String> e() {
            return this.ids;
        }

        public final boolean equals(Object obj) {
            return c(this.ids, obj);
        }

        /* renamed from: h, reason: from getter */
        public final /* synthetic */ List getIds() {
            return this.ids;
        }

        public final int hashCode() {
            return this.ids.hashCode();
        }

        public final String toString() {
            return g(this.ids);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u0013"}, d2 = {"Lcom/yandex/div/storage/templates/b$b;", "Lcom/yandex/div/storage/templates/b;", "", "id", "b", "(Ljava/lang/String;)Ljava/lang/String;", "g", "", "f", "(Ljava/lang/String;)I", "", "other", "", "c", "(Ljava/lang/String;Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.templates.b$b, reason: collision with other inner class name */
    public static final class C0037b implements b {

        /* renamed from: a, reason: from kotlin metadata */
        private final String id;

        private /* synthetic */ C0037b(String str) {
            this.id = str;
        }

        public static final /* synthetic */ C0037b a(String str) {
            return new C0037b(str);
        }

        public static String b(String str) {
            return str;
        }

        public static boolean c(String str, Object obj) {
            return (obj instanceof C0037b) && jl40.l(str, ((C0037b) obj).id);
        }

        public static final boolean d(String str, String str2) {
            return jl40.l(str, str2);
        }

        public static int f(String str) {
            return str.hashCode();
        }

        public static String g(String str) {
            return unr0.l(')', "Single(id=", str);
        }

        /* renamed from: e, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public final boolean equals(Object obj) {
            return c(this.id, obj);
        }

        public final /* synthetic */ String h() {
            return this.id;
        }

        public final int hashCode() {
            return this.id.hashCode();
        }

        public final String toString() {
            return g(this.id);
        }
    }
}
