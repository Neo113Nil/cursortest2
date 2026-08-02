package com.yandex.passport.internal.database.auth_cookie;

import androidx.room.RoomDatabase;
import defpackage.hjv;

/* loaded from: classes8.dex */
public final class c extends hjv {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(RoomDatabase roomDatabase, int i) {
        super(roomDatabase);
        this.d = i;
    }

    @Override // defpackage.hjv
    public final String c() {
        switch (this.d) {
            case 0:
                return "DELETE FROM modern_auth_cookie WHERE uid = ?";
            case 1:
                return "UPDATE diary_method set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?";
            case 2:
                return "UPDATE diary_parameter set uploadId = ? WHERE uploadId is null AND issuedAt >= ? AND issuedAt <= ?";
            case 3:
                return "DELETE FROM diary_method WHERE uploadId is not null AND issuedAt <= ?";
            default:
                return "DELETE FROM diary_parameter WHERE uploadId is not null AND issuedAt <= ?";
        }
    }
}
