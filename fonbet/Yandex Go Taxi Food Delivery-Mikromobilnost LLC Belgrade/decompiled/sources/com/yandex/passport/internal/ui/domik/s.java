package com.yandex.passport.internal.ui.domik;

import com.yandex.passport.internal.ui.domik.RegTrack;

/* loaded from: classes2.dex */
public final class s {
    public static RegTrack a(AuthTrack authTrack, RegTrack.RegOrigin regOrigin) {
        return new RegTrack(authTrack.getProperties(), authTrack.getTrackId(), authTrack.getLogin(), authTrack.getPassword(), authTrack.getPhoneNumber(), null, null, null, authTrack.getSuggestedLanguage(), regOrigin, authTrack.getAccountForRelogin(), authTrack.getAccountType(), null, null, false, authTrack.getUnsubscribeMailing());
    }
}
