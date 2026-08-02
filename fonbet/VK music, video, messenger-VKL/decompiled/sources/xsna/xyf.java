package xsna;

import android.os.Build;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import com.vk.clips.coauthors.domain.model.ClipsCoauthorSelectorUserItem;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.presentation.model.CoauthorDto;
import java.util.ArrayList;
import ru.ok.android.externcalls.sdk.id.ParticipantId;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManager;
import ru.ok.android.externcalls.sdk.stereo.StereoRoomManagerAdaptersKt;
import xsna.h8z0;
import xsna.hjz0;
import xsna.rfb0;
import xsna.tq70;
import xsna.xn50;
import xsna.zfz0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class xyf implements pcs, tq70.b, io.reactivex.rxjava3.core.d, h8z0.b, zfz0.a {
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ xyf(Object obj, Object obj2) {
        this.b = obj;
        this.c = obj2;
    }

    @Override // xsna.h8z0.b
    public void a() {
        euy0 euy0Var = (euy0) this.b;
        xey0 xey0Var = (xey0) this.c;
        hjz0.a aVar = euy0Var.a;
        String str = xey0Var.F;
        yil0.d(aVar);
    }

    @Override // xsna.tq70.b
    public void accept(Object obj) {
        ((rfb0.a) obj).g((g250) this.b, ((com.vk.dto.music.a) this.c).b);
    }

    @Override // xsna.zfz0.a
    public void c() {
        ((fkz0) this.b).getClass();
    }

    @Override // xsna.pcs
    public void p(Bundle bundle, String str) {
        FragmentManager fragmentManager = (FragmentManager) this.b;
        yyf yyfVar = (yyf) this.c;
        ArrayList<ClipsCoauthorSelectorUserItem> parcelableArrayList = Build.VERSION.SDK_INT >= 33 ? bundle.getParcelableArrayList("post_co_result", ClipsCoauthorSelectorUserItem.class) : bundle.getParcelableArrayList("post_co_result");
        if (parcelableArrayList != null) {
            ArrayList arrayList = new ArrayList(c5g.u(parcelableArrayList, 10));
            for (ClipsCoauthorSelectorUserItem clipsCoauthorSelectorUserItem : parcelableArrayList) {
                UserId userId = clipsCoauthorSelectorUserItem.b;
                String d = clipsCoauthorSelectorUserItem.d();
                String str2 = clipsCoauthorSelectorUserItem.e;
                Serializer.c<Image> cVar = Image.CREATOR;
                arrayList.add(new CoauthorDto(new Owner(userId, d, null, str2, null, Image.b.c(str2, 50, 50, ImageSizeKey.SIZE_KEY_UNDEFINED), null, null, null, null, null, null, null, false, false, false, false, null, 0, null, null, false, 4194260, null)));
            }
            xn50.a.c(yyfVar.c.a, new PostingAction.Editing.CoauthorsSelected(arrayList));
        }
        fragmentManager.f("post_co_request");
    }

    @Override // io.reactivex.rxjava3.core.d
    public void subscribe(io.reactivex.rxjava3.core.b bVar) {
        StereoRoomManagerAdaptersKt.revokePromotion$lambda$0((StereoRoomManager) this.b, (ParticipantId) this.c, bVar);
    }
}
