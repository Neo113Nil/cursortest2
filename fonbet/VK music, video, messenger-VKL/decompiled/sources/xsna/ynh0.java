package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.search.communities.map.api.domain.LocationCoordinate;

/* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
/* loaded from: classes5.dex */
public interface ynh0 extends kj50 {

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class a implements ynh0 {
        public static final a b = new a();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class b implements ynh0 {
        public static final b b = new b();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class c implements ynh0 {
        public static final c b = new c();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class d implements ynh0 {
        public static final d b = new d();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class e implements ynh0 {
        public final UserId b;
        public final LocationCoordinate c;

        public e(UserId userId, LocationCoordinate locationCoordinate) {
            this.b = userId;
            this.c = locationCoordinate;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return epx.f(this.b, eVar.b) && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            int hashCode = Long.hashCode(this.b.b) * 31;
            LocationCoordinate locationCoordinate = this.c;
            return hashCode + (locationCoordinate == null ? 0 : locationCoordinate.hashCode());
        }

        public final String toString() {
            return "Initialized(groupId=" + this.b + ", location=" + this.c + ')';
        }
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class f implements ynh0 {
        public static final f b = new f();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class g implements ynh0 {
        public static final g b = new g();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class h implements ynh0 {
        public static final h b = new h();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class i implements ynh0 {
        public static final i b = new i();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class j implements ynh0 {
        public static final j b = new j();
    }

    /* compiled from: SearchCommunitiesOnMapDetailsAction.kt */
    public static final class k implements ynh0 {
        public static final k b = new k();
    }
}
