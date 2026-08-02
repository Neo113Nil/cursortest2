package com.yandex.passport.internal.database.diary;

import androidx.room.RoomDatabase;
import defpackage.z2o;
import defpackage.zfs;

/* loaded from: classes8.dex */
public final class c extends z2o {
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
                return "INSERT OR ABORT INTO `diary_method` (`id`,`name`,`isUiMethod`,`issuedAt`,`uploadId`) VALUES (nullif(?, 0),?,?,?,?)";
            case 1:
                return "INSERT OR ABORT INTO `diary_parameter` (`id`,`name`,`methodName`,`value`,`issuedAt`,`uploadId`) VALUES (nullif(?, 0),?,?,?,?,?)";
            default:
                return "INSERT OR ABORT INTO `diary_upload` (`id`,`uploadedAt`) VALUES (nullif(?, 0),?)";
        }
    }

    @Override // defpackage.z2o
    public final void m(zfs zfsVar, Object obj) {
        switch (this.d) {
            case 0:
                a aVar = (a) obj;
                aVar.getClass();
                zfsVar.b(1, 0L);
                String str = aVar.a;
                if (str == null) {
                    zfsVar.p(2);
                } else {
                    zfsVar.m0(2, str);
                }
                zfsVar.b(3, aVar.b ? 1L : 0L);
                zfsVar.b(4, aVar.c);
                zfsVar.p(5);
                break;
            case 1:
                b bVar = (b) obj;
                bVar.getClass();
                zfsVar.b(1, 0L);
                String str2 = bVar.a;
                if (str2 == null) {
                    zfsVar.p(2);
                } else {
                    zfsVar.m0(2, str2);
                }
                String str3 = bVar.b;
                if (str3 == null) {
                    zfsVar.p(3);
                } else {
                    zfsVar.m0(3, str3);
                }
                zfsVar.m0(4, bVar.c);
                zfsVar.b(5, bVar.d);
                zfsVar.p(6);
                break;
            default:
                f fVar = (f) obj;
                zfsVar.b(1, fVar.a());
                zfsVar.b(2, fVar.b());
                break;
        }
    }
}
