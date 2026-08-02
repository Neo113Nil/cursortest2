package xsna;

import androidx.room.RoomDatabase;
import com.google.gson.Gson;
import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.ugc.UGCStickerModel;
import com.vk.repository.internal.repos.stickers.database.converters.dto.ImageListDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UGCStickerModelDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UgcPackEditDto;
import com.vk.repository.internal.repos.stickers.database.converters.dto.UgcStatusDto;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.en00;

/* compiled from: UgcStickersDao_Impl.kt */
/* loaded from: classes5.dex */
public final class lyp0 implements kyp0 {
    public final RoomDatabase a;
    public final a b = new a();

    /* compiled from: UgcStickersDao_Impl.kt */
    public static final class a extends fqa {
        @Override // xsna.fqa
        public final void c(qyg0 qyg0Var, Object obj) {
            UgcStatusDto ugcStatusDto;
            dwp0 dwp0Var = (dwp0) obj;
            Gson gson = psj.a;
            int i = 1;
            qyg0Var.bindLong(1, dwp0Var.a.b);
            int i2 = 2;
            qyg0Var.bindLong(2, dwp0Var.b);
            List<UGCStickerModel> list = dwp0Var.c;
            Gson gson2 = psj.a;
            List<UGCStickerModel> list2 = list;
            ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
            for (UGCStickerModel uGCStickerModel : list2) {
                long j = uGCStickerModel.b.b;
                long j2 = uGCStickerModel.c;
                long j3 = uGCStickerModel.d;
                ImageListDto f = en00.f(uGCStickerModel.e);
                int i3 = en00.a.$EnumSwitchMapping$2[uGCStickerModel.f.ordinal()];
                if (i3 == i) {
                    ugcStatusDto = UgcStatusDto.CLAIMED;
                } else if (i3 == i2) {
                    ugcStatusDto = UgcStatusDto.BANNED;
                } else if (i3 == 3) {
                    ugcStatusDto = UgcStatusDto.DELETED;
                } else if (i3 == 4) {
                    ugcStatusDto = UgcStatusDto.AGE_RESTRICTED;
                } else {
                    if (i3 != 5) {
                        throw new NoWhenBranchMatchedException();
                    }
                    ugcStatusDto = UgcStatusDto.OK;
                }
                arrayList.add(new UGCStickerModelDto(j, j2, j3, f, ugcStatusDto, uGCStickerModel.g));
                i = 1;
                i2 = 2;
            }
            qyg0Var.D3(3, gson2.toJson(arrayList));
            qyg0Var.D3(4, dwp0Var.d);
            iyp0 iyp0Var = dwp0Var.e;
            qyg0Var.D3(5, psj.a.toJson(iyp0Var != null ? new UgcPackEditDto(iyp0Var.a, iyp0Var.b, iyp0Var.c, iyp0Var.d) : null));
        }

        @Override // xsna.fqa
        public final String e() {
            return "INSERT OR REPLACE INTO `ugc_packs` (`ownerId`,`id`,`stickers`,`hash`,`editParams`) VALUES (?,?,?,?,?)";
        }
    }

    /* compiled from: UgcStickersDao_Impl.kt */
    public static final class b extends gu8 {
    }

    public lyp0(RoomDatabase roomDatabase) {
        this.a = roomDatabase;
        new b();
    }

    @Override // xsna.kyp0
    public final void a(ArrayList arrayList) {
        u370.f(this.a, false, true, new qum0(2, this, arrayList));
    }

    @Override // xsna.kyp0
    public final List<dwp0> b() {
        return (List) u370.f(this.a, true, false, new ye40(21));
    }

    @Override // xsna.kyp0
    public final List<dwp0> c(long j) {
        return (List) u370.f(this.a, true, false, new vsr(j, 2));
    }

    @Override // xsna.kyp0
    public final void d(UserId userId) {
        u370.f(this.a, false, true, new f6m0(userId, 7));
    }
}
