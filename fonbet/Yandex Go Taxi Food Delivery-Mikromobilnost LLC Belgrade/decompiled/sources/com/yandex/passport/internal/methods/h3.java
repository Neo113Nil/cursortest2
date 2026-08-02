package com.yandex.passport.internal.methods;

import com.yandex.passport.api.impl.UserIdProperties;
import com.yandex.passport.data.network.GetTrackFromMagicRequest$State;
import com.yandex.passport.internal.entities.TrackId;
import com.yandex.passport.internal.entities.UserCredentials;
import com.yandex.passport.internal.properties.TurboAppAuthProperties;
import com.yandex.passport.internal.stash.StashCell;
import defpackage.yhl;

/* loaded from: classes15.dex */
public final class h3 extends t {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h3(String str, int i) {
        super(c.F, str);
        switch (i) {
            case 1:
                super(c.G, str);
                break;
            case 2:
                super(c.H, str);
                break;
            case 3:
                super(n.D, str);
                break;
            case 4:
                super(n.E, str);
                break;
            case 5:
            case 6:
            case 8:
            default:
                break;
            case 7:
                super(c.I, str);
                break;
            case 9:
                super(c.K, str);
                break;
        }
    }

    public StashCell c() {
        com.yandex.passport.internal.stash.b bVar = StashCell.Companion;
        String str = (String) this.c;
        bVar.getClass();
        StashCell a = com.yandex.passport.internal.stash.b.a(str);
        if (a != null) {
            return a;
        }
        yhl.d(str, "no such cell ");
        return null;
    }

    public h3(TrackId trackId) {
        super(g.N, trackId);
    }

    public h3(TurboAppAuthProperties turboAppAuthProperties) {
        super(g.O, turboAppAuthProperties);
    }

    public h3(UserCredentials userCredentials) {
        super(g.R, userCredentials);
    }

    public h3(GetTrackFromMagicRequest$State getTrackFromMagicRequest$State) {
        super(g.M, getTrackFromMagicRequest$State);
    }

    public h3(UserIdProperties userIdProperties) {
        super(g.S, userIdProperties);
    }
}
