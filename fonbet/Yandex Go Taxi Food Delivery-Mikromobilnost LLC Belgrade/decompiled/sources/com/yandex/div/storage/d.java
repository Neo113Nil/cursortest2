package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import defpackage.g9i0;
import defpackage.i9i0;
import defpackage.jl40;
import defpackage.tls;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001:\u0001\u0013J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H'¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H'¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000eH'¢\u0006\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0015À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/d;", "", "Lcom/yandex/div/storage/d$a;", "payload", "Lcom/yandex/div/storage/f;", "c", "(Lcom/yandex/div/storage/d$a;)Lcom/yandex/div/storage/f;", "", "", "ids", "b", "(Ljava/util/List;)Lcom/yandex/div/storage/f;", "getAll", "()Lcom/yandex/div/storage/f;", "Lkotlin/Function1;", "Lg9i0;", "", "predicate", "Li9i0;", "a", "(Ltls;)Li9i0;", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface d {
    i9i0 a(tls predicate);

    f b(List<String> ids);

    f c(a payload);

    f getAll();

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001a\u0010\nR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001b\u001a\u0004\b\u001c\u0010\f¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/storage/d$a;", "", "", "Lg9i0;", "jsons", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "<init>", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)V", "a", "()Ljava/util/List;", "b", "()Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "c", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lcom/yandex/div/storage/d$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "e", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: from kotlin metadata */
        private final List<g9i0> jsons;

        /* renamed from: b, reason: from kotlin metadata */
        private final DivDataRepository.ActionOnError actionOnError;

        public /* synthetic */ a(List list, DivDataRepository.ActionOnError actionOnError, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? DivDataRepository.ActionOnError.ABORT_TRANSACTION : actionOnError);
        }

        public static a d(a aVar, List list, DivDataRepository.ActionOnError actionOnError, int i, Object obj) {
            if ((i & 1) != 0) {
                list = aVar.jsons;
            }
            if ((i & 2) != 0) {
                actionOnError = aVar.actionOnError;
            }
            aVar.getClass();
            return new a(list, actionOnError);
        }

        public final List<g9i0> a() {
            return this.jsons;
        }

        /* renamed from: b, reason: from getter */
        public final DivDataRepository.ActionOnError getActionOnError() {
            return this.actionOnError;
        }

        public final a c(List<? extends g9i0> jsons, DivDataRepository.ActionOnError actionOnError) {
            return new a(jsons, actionOnError);
        }

        public final DivDataRepository.ActionOnError e() {
            return this.actionOnError;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return jl40.l(this.jsons, aVar.jsons) && this.actionOnError == aVar.actionOnError;
        }

        public final List<g9i0> f() {
            return this.jsons;
        }

        public final int hashCode() {
            return this.actionOnError.hashCode() + (this.jsons.hashCode() * 31);
        }

        public final String toString() {
            return "Payload(jsons=" + this.jsons + ", actionOnError=" + this.actionOnError + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends g9i0> list, DivDataRepository.ActionOnError actionOnError) {
            this.jsons = list;
            this.actionOnError = actionOnError;
        }
    }
}
