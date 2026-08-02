package xsna;

import com.vk.dto.common.id.UserId;
import com.vk.dto.stickers.StickersPromoModel;
import com.vk.dto.stickers.VmojiAvatarModel;
import com.vk.dto.stickers.images.ImageConfig;
import com.vk.dto.stickers.images.ImagesConfigsSet;
import com.vk.repository.internal.repos.stickers.database.StickersDatabase;
import com.vk.repository.internal.repos.stickers.database.entity.ImageConfigEntity;
import com.vk.repository.internal.repos.stickers.database.entity.ImagesConfigsEntity;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: StickersDBStorage.kt */
/* loaded from: classes5.dex */
public final class m9l0 {
    public final io.reactivex.rxjava3.disposables.b a;

    public m9l0(io.reactivex.rxjava3.disposables.b bVar) {
        this.a = bVar;
    }

    public final void a(gzs<s3q0> gzsVar) {
        this.a.b(new io.reactivex.rxjava3.internal.operators.single.v(new vyt(gzsVar, 2)).q(asu0.a.c()).subscribe());
    }

    public final ArrayList b() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<ImagesConfigsEntity> list = StickersDatabase.a.b().y().get();
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (ImagesConfigsEntity imagesConfigsEntity : list) {
            String c = imagesConfigsEntity.c();
            int b = imagesConfigsEntity.b();
            List<ImageConfigEntity> a = imagesConfigsEntity.a();
            ArrayList arrayList2 = new ArrayList(c5g.u(a, 10));
            for (ImageConfigEntity imageConfigEntity : a) {
                arrayList2.add(new ImageConfig(imageConfigEntity.a(), imageConfigEntity.c(), imageConfigEntity.b(), imageConfigEntity.d()));
            }
            arrayList.add(new ImagesConfigsSet(c, b, arrayList2));
        }
        return arrayList;
    }

    public final ArrayList c() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<lbl0> list = StickersDatabase.a.b().C().get();
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (lbl0 lbl0Var : list) {
            arrayList.add(new StickersPromoModel(lbl0Var.b, lbl0Var.c, lbl0Var.d, lbl0Var.e, lbl0Var.f, lbl0Var.g));
        }
        return arrayList;
    }

    public final ArrayList d() {
        HashMap<UserId, StickersDatabase> hashMap = StickersDatabase.m;
        List<z5w0> list = StickersDatabase.a.b().K().get();
        ArrayList arrayList = new ArrayList(c5g.u(list, 10));
        for (z5w0 z5w0Var : list) {
            arrayList.add(new VmojiAvatarModel(z5w0Var.a, z5w0Var.b, z5w0Var.c, z5w0Var.d, z5w0Var.e, z5w0Var.f));
        }
        return arrayList;
    }
}
