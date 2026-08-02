package com.yandex.div.storage;

import com.yandex.div.storage.DivDataRepository;
import com.yandex.div.storage.database.StorageException;
import defpackage.b64;
import defpackage.c9i0;
import defpackage.cai0;
import defpackage.g9i0;
import defpackage.jl40;
import defpackage.kju0;
import defpackage.sey0;
import defpackage.tls;
import defpackage.unr0;
import defpackage.w511;
import defpackage.xko;
import io.appmetrica.analytics.push.coreutils.internal.CoreConstants;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001:\u0004\")\u0015 J;\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00042\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\n\u001a\u00020\tH'¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00142\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H'¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00180\u0017H'¢\u0006\u0004\b\u001b\u0010\u001cJ1\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00142\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00020\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H'¢\u0006\u0004\b \u0010!J#\u0010\"\u001a\u00020\u001a2\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00180\u0017H'¢\u0006\u0004\b\"\u0010\u001cJ\u0011\u0010$\u001a\u0004\u0018\u00010#H'¢\u0006\u0004\b$\u0010%J#\u0010(\u001a\b\u0012\u0004\u0012\u00020'0\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020\u0012H'¢\u0006\u0004\b(\u0010\u0016J\u0011\u0010)\u001a\u0004\u0018\u00010#H'¢\u0006\u0004\b)\u0010%J\u001f\u0010+\u001a\u00020\u00182\u0006\u0010*\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b+\u0010,J\u0017\u0010.\u001a\u00020\u00182\u0006\u0010-\u001a\u00020\u0002H&¢\u0006\u0004\b.\u0010/J\u0015\u00101\u001a\b\u0012\u0004\u0012\u0002000\u0014H&¢\u0006\u0004\b1\u00102R,\u00109\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020504\u0012\u0004\u0012\u000206038&X¦\u0004¢\u0006\u0006\u001a\u0004\b7\u00108ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006:À\u0006\u0001"}, d2 = {"Lcom/yandex/div/storage/c;", "", "", "groupId", "", "Lc9i0;", "divs", "Lsey0;", "templatesByHash", "Lcom/yandex/div/storage/DivDataRepository$ActionOnError;", "actionOnError", "Lxko;", "g", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "Lg9i0;", "rawJsons", "m", "(Ljava/util/List;Lcom/yandex/div/storage/DivDataRepository$ActionOnError;)Lxko;", "", "rawJsonIds", "Lcom/yandex/div/storage/c$a;", "c", "(Ljava/util/Set;)Lcom/yandex/div/storage/c$a;", "Lkotlin/Function1;", "", "predicate", "Lcom/yandex/div/storage/c$b;", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "(Ltls;)Lcom/yandex/div/storage/c$b;", "ids", "idsToExclude", "Lcom/yandex/div/storage/c$c;", "d", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/c$a;", "a", "Lcom/yandex/div/storage/DivStorageErrorException;", "f", "()Lcom/yandex/div/storage/DivStorageErrorException;", "templateHashes", "Lcai0;", "l", "b", "id", "k", "(Ljava/lang/String;Ljava/lang/String;)Z", "templateHash", "h", "(Ljava/lang/String;)Z", "Lcom/yandex/div/storage/c$d;", "e", "()Lcom/yandex/div/storage/c$a;", "", "Lkotlin/Pair;", "", "Lcom/yandex/div/storage/database/e;", CoreConstants.PushMessage.SERVICE_TYPE, "()Ljava/util/Map;", "migrations", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface c {

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\tJ\u0010\u0010\u000b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\tJ.\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b\u0018\u0010\tR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0019\u0010\t¨\u0006\u001a"}, d2 = {"Lcom/yandex/div/storage/c$d;", "", "", "groupId", "templateId", "templateHash", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "c", "d", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/yandex/div/storage/c$d;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "f", "h", "g", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class d {

        /* renamed from: a, reason: from kotlin metadata */
        private final String groupId;

        /* renamed from: b, reason: from kotlin metadata */
        private final String templateId;

        /* renamed from: c, reason: from kotlin metadata */
        private final String templateHash;

        public d(String str, String str2, String str3) {
            this.groupId = str;
            this.templateId = str2;
            this.templateHash = str3;
        }

        public static d e(d dVar, String str, String str2, String str3, int i, Object obj) {
            if ((i & 1) != 0) {
                str = dVar.groupId;
            }
            if ((i & 2) != 0) {
                str2 = dVar.templateId;
            }
            if ((i & 4) != 0) {
                str3 = dVar.templateHash;
            }
            dVar.getClass();
            return new d(str, str2, str3);
        }

        /* renamed from: a, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        /* renamed from: b, reason: from getter */
        public final String getTemplateId() {
            return this.templateId;
        }

        /* renamed from: c, reason: from getter */
        public final String getTemplateHash() {
            return this.templateHash;
        }

        public final d d(String groupId, String templateId, String templateHash) {
            return new d(groupId, templateId, templateHash);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof d)) {
                return false;
            }
            d dVar = (d) other;
            return jl40.l(this.groupId, dVar.groupId) && jl40.l(this.templateId, dVar.templateId) && jl40.l(this.templateHash, dVar.templateHash);
        }

        public final String f() {
            return this.groupId;
        }

        public final String g() {
            return this.templateHash;
        }

        public final String h() {
            return this.templateId;
        }

        public final int hashCode() {
            return this.templateHash.hashCode() + unr0.b(this.groupId.hashCode() * 31, 31, this.templateId);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TemplateReference(groupId=");
            sb.append(this.groupId);
            sb.append(", templateId=");
            sb.append(this.templateId);
            sb.append(", templateHash=");
            return b64.p(sb, this.templateHash, ')');
        }
    }

    b a(tls predicate);

    DivStorageErrorException b();

    a<g9i0> c(Set<String> rawJsonIds);

    a<C0035c> d(List<String> ids, List<String> idsToExclude);

    a<d> e();

    DivStorageErrorException f();

    xko g(String groupId, List<? extends c9i0> divs, List<sey0> templatesByHash, DivDataRepository.ActionOnError actionOnError);

    boolean h(String templateHash) throws DivStorageErrorException;

    Map<Pair<Integer, Integer>, com.yandex.div.storage.database.e> i();

    b j(tls predicate);

    boolean k(String id, String groupId) throws DivStorageErrorException;

    a<cai0> l(Set<String> templateHashes);

    xko m(List<? extends g9i0> rawJsons, DivDataRepository.ActionOnError actionOnError);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0096\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ6\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\nR \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u001a\u0010\n¨\u0006\u001b"}, d2 = {"Lcom/yandex/div/storage/c$a;", "T", "", "", "restoredData", "Lcom/yandex/div/storage/database/StorageException;", "errors", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "a", "()Ljava/util/List;", "b", "c", "(Ljava/util/List;Ljava/util/List;)Lcom/yandex/div/storage/c$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "f", "e", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static /* data */ class a<T> {

        /* renamed from: a, reason: from kotlin metadata */
        private final List<T> restoredData;

        /* renamed from: b, reason: from kotlin metadata */
        private final List<StorageException> errors;

        public /* synthetic */ a(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(list, (i & 2) != 0 ? EmptyList.a : list2);
        }

        public static a d(a aVar, List list, List list2, int i, Object obj) {
            if (obj != null) {
                w511.x("Super calls with default arguments not supported in this target, function: copy");
                return null;
            }
            if ((i & 1) != 0) {
                list = aVar.restoredData;
            }
            if ((i & 2) != 0) {
                list2 = aVar.errors;
            }
            aVar.getClass();
            return new a(list, list2);
        }

        public final List<T> a() {
            return this.restoredData;
        }

        public final List<StorageException> b() {
            return this.errors;
        }

        public final a<T> c(List<? extends T> restoredData, List<? extends StorageException> errors) {
            return new a<>(restoredData, errors);
        }

        public final List<StorageException> e() {
            return this.errors;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof a)) {
                return false;
            }
            a aVar = (a) other;
            return jl40.l(this.restoredData, aVar.restoredData) && jl40.l(this.errors, aVar.errors);
        }

        public final List<T> f() {
            return this.restoredData;
        }

        public final int hashCode() {
            return this.errors.hashCode() + (this.restoredData.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("LoadDataResult(restoredData=");
            sb.append(this.restoredData);
            sb.append(", errors=");
            return unr0.t(sb, this.errors, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(List<? extends T> list, List<? extends StorageException> list2) {
            this.restoredData = list;
            this.errors = list2;
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ0\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0019\u001a\u0004\b\u001a\u0010\u000bR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\b\u001c\u0010\r¨\u0006\u001d"}, d2 = {"Lcom/yandex/div/storage/c$b;", "", "", "", "ids", "", "Lcom/yandex/div/storage/database/StorageException;", "errors", "<init>", "(Ljava/util/Set;Ljava/util/List;)V", "a", "()Ljava/util/Set;", "b", "()Ljava/util/List;", "c", "(Ljava/util/Set;Ljava/util/List;)Lcom/yandex/div/storage/c$b;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Set;", "f", "Ljava/util/List;", "e", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final /* data */ class b {

        /* renamed from: a, reason: from kotlin metadata */
        private final Set<String> ids;

        /* renamed from: b, reason: from kotlin metadata */
        private final List<StorageException> errors;

        public /* synthetic */ b(Set set, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(set, (i & 2) != 0 ? EmptyList.a : list);
        }

        public static b d(b bVar, Set set, List list, int i, Object obj) {
            if ((i & 1) != 0) {
                set = bVar.ids;
            }
            if ((i & 2) != 0) {
                list = bVar.errors;
            }
            bVar.getClass();
            return new b(set, list);
        }

        public final Set<String> a() {
            return this.ids;
        }

        public final List<StorageException> b() {
            return this.errors;
        }

        public final b c(Set<String> ids, List<? extends StorageException> errors) {
            return new b(ids, errors);
        }

        public final List<StorageException> e() {
            return this.errors;
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof b)) {
                return false;
            }
            b bVar = (b) other;
            return jl40.l(this.ids, bVar.ids) && jl40.l(this.errors, bVar.errors);
        }

        public final Set<String> f() {
            return this.ids;
        }

        public final int hashCode() {
            return this.errors.hashCode() + (this.ids.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RemoveResult(ids=");
            sb.append(this.ids);
            sb.append(", errors=");
            return unr0.t(sb, this.errors, ')');
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b(Set<String> set, List<? extends StorageException> list) {
            this.ids = set;
            this.errors = list;
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u0002HÀ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ:\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u001c\u001a\u0004\b\u001e\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001a\u001a\u0004\b\u001f\u0010\u000b¨\u0006 "}, d2 = {"Lcom/yandex/div/storage/c$c;", "", "", "id", "Lorg/json/JSONObject;", "divData", kju0.j, "groupId", "<init>", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)V", "a", "()Ljava/lang/String;", "b", "()Lorg/json/JSONObject;", "c", "d", "e", "(Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/String;)Lcom/yandex/div/storage/c$c;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", CoreConstants.PushMessage.SERVICE_TYPE, "Lorg/json/JSONObject;", "g", CoreConstants.PushMessage.PROCESSING_MIN_TIME, "h", "div-storage_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.yandex.div.storage.c$c, reason: collision with other inner class name */
    public static final /* data */ class C0035c {

        /* renamed from: a, reason: from kotlin metadata */
        private final String id;

        /* renamed from: b, reason: from kotlin metadata */
        private final JSONObject divData;

        /* renamed from: c, reason: from kotlin metadata */
        private final JSONObject metadata;

        /* renamed from: d, reason: from kotlin metadata */
        private final String groupId;

        public C0035c(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2) {
            this.id = str;
            this.divData = jSONObject;
            this.metadata = jSONObject2;
            this.groupId = str2;
        }

        public static C0035c f(C0035c c0035c, String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = c0035c.id;
            }
            if ((i & 2) != 0) {
                jSONObject = c0035c.divData;
            }
            if ((i & 4) != 0) {
                jSONObject2 = c0035c.metadata;
            }
            if ((i & 8) != 0) {
                str2 = c0035c.groupId;
            }
            c0035c.getClass();
            return new C0035c(str, jSONObject, jSONObject2, str2);
        }

        /* renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: b, reason: from getter */
        public final JSONObject getDivData() {
            return this.divData;
        }

        /* renamed from: c, reason: from getter */
        public final JSONObject getMetadata() {
            return this.metadata;
        }

        /* renamed from: d, reason: from getter */
        public final String getGroupId() {
            return this.groupId;
        }

        public final C0035c e(String id, JSONObject divData, JSONObject metadata, String groupId) {
            return new C0035c(id, divData, metadata, groupId);
        }

        public final boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof C0035c)) {
                return false;
            }
            C0035c c0035c = (C0035c) other;
            return jl40.l(this.id, c0035c.id) && jl40.l(this.divData, c0035c.divData) && jl40.l(this.metadata, c0035c.metadata) && jl40.l(this.groupId, c0035c.groupId);
        }

        public final JSONObject g() {
            return this.divData;
        }

        public final String h() {
            return this.groupId;
        }

        public final int hashCode() {
            int hashCode = (this.divData.hashCode() + (this.id.hashCode() * 31)) * 31;
            JSONObject jSONObject = this.metadata;
            return this.groupId.hashCode() + ((hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31);
        }

        public final String i() {
            return this.id;
        }

        public final JSONObject j() {
            return this.metadata;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("RestoredRawData(id=");
            sb.append(this.id);
            sb.append(", divData=");
            sb.append(this.divData);
            sb.append(", metadata=");
            sb.append(this.metadata);
            sb.append(", groupId=");
            return b64.p(sb, this.groupId, ')');
        }

        public /* synthetic */ C0035c(String str, JSONObject jSONObject, JSONObject jSONObject2, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, jSONObject, (i & 4) != 0 ? null : jSONObject2, str2);
        }
    }
}
