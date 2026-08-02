package xsna;

import com.vk.api.generated.groups.dto.GroupsLeaveLeaveModeDto;
import com.vk.dto.hints.HintId;
import com.vk.stat.scheme.CommonMarketStat$TypeCtaButtonPositionType;
import xsna.ln50;
import xsna.on50;

/* compiled from: StorefrontTask.kt */
/* loaded from: classes18.dex */
public interface dpl0 extends hn50 {

    /* compiled from: StorefrontTask.kt */
    public static final class a implements dpl0 {
        public final ay00 b;

        public a(ay00 ay00Var) {
            this.b = ay00Var;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class b implements dpl0 {
        public final b5u b;

        public b(b5u b5uVar) {
            this.b = b5uVar;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ChangeFave(good=" + this.b + ')';
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class c implements dpl0 {
        public static final c b = new c();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return 1695077327;
        }

        public final String toString() {
            return "ClearModerationBlur";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class d implements dpl0 {
        public static final d b = new d();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -886337925;
        }

        public final String toString() {
            return "Initialize";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class e implements dpl0 {
        public static final e b = new e();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -2053555648;
        }

        public final String toString() {
            return "LoadPage";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class f implements dpl0 {
        public static final f b = new f();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -987860476;
        }

        public final String toString() {
            return "Reload";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class g implements dpl0 {
        public static final g b = new g();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -1828277159;
        }

        public final String toString() {
            return "ReloadBookmarks";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class h implements dpl0 {
        public static final h b = new h();

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return -96038657;
        }

        public final String toString() {
            return "Subscribe";
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class i implements dpl0 {
        public final boolean b;
        public final GroupsLeaveLeaveModeDto c;

        public i(boolean z, GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto) {
            this.b = z;
            this.c = groupsLeaveLeaveModeDto;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.b == iVar.b && this.c == iVar.c;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.b) * 31;
            GroupsLeaveLeaveModeDto groupsLeaveLeaveModeDto = this.c;
            return hashCode + (groupsLeaveLeaveModeDto == null ? 0 : groupsLeaveLeaveModeDto.hashCode());
        }

        public final String toString() {
            return "Unsubscribe(withLeave=" + this.b + ", leaveModeDto=" + this.c + ')';
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class j implements dpl0 {
        public final HintId b;

        public j(HintId hintId) {
            this.b = hintId;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof j) && this.b == ((j) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateTooltip(hindId=" + this.b + ')';
        }
    }

    /* compiled from: StorefrontTask.kt */
    public static final class k implements dpl0 {
        public final ja9 b;
        public final CommonMarketStat$TypeCtaButtonPositionType c;

        public k(ja9 ja9Var, CommonMarketStat$TypeCtaButtonPositionType commonMarketStat$TypeCtaButtonPositionType) {
            this.b = ja9Var;
            this.c = commonMarketStat$TypeCtaButtonPositionType;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return epx.f(this.b, kVar.b) && this.c == kVar.c;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "VKCall(cta=" + this.b + ", posType=" + this.c + ')';
        }
    }
}
