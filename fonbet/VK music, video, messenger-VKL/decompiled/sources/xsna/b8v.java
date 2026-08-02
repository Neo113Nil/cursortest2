package xsna;

import android.os.Parcelable;
import com.vk.api.generated.users.dto.UsersFieldsDto;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.market.album.MarketEditAlbumGoodsFragment;
import com.vk.im.ui.fragments.dialogtheme.ImSettingsDialogThemeFragment;
import com.vk.masks.MasksController;
import com.vk.money.MoneyTransferLinkFragment;
import com.vk.poll.fragments.PollResultsFragment;
import com.vkontakte.android.fragments.videos.UploadedVideosFragment;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import xsna.el50;
import xsna.r1r0;
import xsna.vlq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class b8v implements io.reactivex.rxjava3.functions.f {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b8v(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // io.reactivex.rxjava3.functions.f
    public final void accept(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ((b5h) obj2).invoke(obj);
                break;
            case 1:
                ((igh) obj2).invoke(obj);
                break;
            case 2:
                int i2 = ImSettingsDialogThemeFragment.c0;
                ((rcw) obj2).invoke(obj);
                break;
            case 3:
                ((du0) obj2).invoke(obj);
                break;
            case 4:
                int i3 = MarketEditAlbumGoodsFragment.c1;
                ((du0) obj2).invoke(obj);
                break;
            case 5:
                MasksController masksController = (MasksController) obj2;
                masksController.getClass();
                wmi0.a.m("ok_effects_catalog", (ArrayList) obj);
                masksController.b.clear();
                break;
            case 6:
                ((h2s) obj2).invoke(obj);
                break;
            case 7:
                int i4 = MoneyTransferLinkFragment.u0;
                ((kn20) obj2).invoke(obj);
                break;
            case 8:
                ((swe) obj2).invoke(obj);
                break;
            case 9:
                ((kn20) obj2).invoke(obj);
                break;
            case 10:
                ((kn20) obj2).invoke(obj);
                break;
            case 11:
                ((kn20) obj2).invoke(obj);
                break;
            case 12:
                ((kn20) obj2).invoke(obj);
                break;
            case 13:
                sma0 sma0Var = (sma0) obj2;
                el50.a.b(sma0Var, new hs00(sma0Var, 18));
                break;
            case 14:
                ((kn20) obj2).invoke(obj);
                break;
            case 15:
                ((f66) obj2).invoke(obj);
                break;
            case 16:
                ((kn20) obj2).invoke(obj);
                break;
            case 17:
                ((PollResultsFragment.b.a) obj2).invoke(obj);
                break;
            case 18:
                ((kn20) obj2).invoke(obj);
                break;
            case 19:
                ((kn20) obj2).invoke(obj);
                break;
            case 20:
                ((kn20) obj2).invoke(obj);
                break;
            case 21:
                ((iyd0) obj2).invoke(obj);
                break;
            case 22:
                ((com.vk.qrcode.j) obj2).invoke(obj);
                break;
            case 23:
                ((ci6) obj2).invoke(obj);
                break;
            case 24:
                ((com.vk.music.onboarding.impl.model.a) obj2).invoke(obj);
                break;
            case 25:
                ((izs) obj2).invoke(obj);
                break;
            case 26:
                ((du0) obj2).invoke(obj);
                break;
            case 27:
                ((m2l0) obj2).invoke(obj);
                break;
            case 28:
                UploadedVideosFragment uploadedVideosFragment = (UploadedVideosFragment) obj2;
                int i5 = UploadedVideosFragment.n1;
                if (obj instanceof paq0) {
                    Parcelable parcelable = ((paq0) obj).b;
                    if (parcelable instanceof VideoFile) {
                        VideoFile videoFile = (VideoFile) parcelable;
                        if (videoFile.I0().equals(uploadedVideosFragment.O0) && uploadedVideosFragment.f0) {
                            io.reactivex.rxjava3.disposables.b bVar = uploadedVideosFragment.j1;
                            u1r0 u1r0Var = uploadedVideosFragment.k1;
                            List asList = Arrays.asList(videoFile.I0());
                            Object[] objArr = {UsersFieldsDto.PHOTO_BASE};
                            ArrayList arrayList = new ArrayList(1);
                            Object obj3 = objArr[0];
                            Objects.requireNonNull(obj3);
                            arrayList.add(obj3);
                            List unmodifiableList = Collections.unmodifiableList(arrayList);
                            u1r0Var.getClass();
                            io.reactivex.rxjava3.internal.operators.observable.f0 W = rsg0.W(yfb.x(r1r0.a.a(asList, null, unmodifiableList, null, null)), 7);
                            nq60 nq60Var = new nq60(2, uploadedVideosFragment, videoFile);
                            com.vk.metrics.eventtracking.b bVar2 = com.vk.metrics.eventtracking.b.a;
                            Objects.requireNonNull(bVar2);
                            bVar.b(W.subscribe(nq60Var, new le50(bVar2, 25)));
                            break;
                        }
                    }
                }
                break;
            default:
                ((vlq0.b) obj2).invoke(obj);
                break;
        }
    }
}
