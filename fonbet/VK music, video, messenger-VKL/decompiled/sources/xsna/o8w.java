package xsna;

import com.vk.im.engine.models.ProfilesInfo;

/* compiled from: ImItemListLoaderUpdate.kt */
/* loaded from: classes2.dex */
public final class o8w implements b6w {
    public final ProfilesInfo a;

    public o8w(ProfilesInfo profilesInfo) {
        this.a = profilesInfo;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o8w) && epx.f(this.a, ((o8w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return io.reactivex.rxjava3.internal.operators.mixed.j.c(new StringBuilder("ImItemsProfilesUpdates(updatedProfiles="), this.a, ')');
    }
}
