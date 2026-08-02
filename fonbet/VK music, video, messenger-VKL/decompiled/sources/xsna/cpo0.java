package xsna;

import android.view.View;
import android.widget.TextView;
import com.vk.api.generated.base.dto.BaseImageDto;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.VideoFile;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.imageloader.view.VKImageView;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.profile.user.impl.ui.b;
import com.vk.profile.user.impl.ui.f;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.List;
import xsna.atq0;
import xsna.l1x0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class cpo0 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ cpo0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        DialogBackground X0;
        ArrayList arrayList;
        int i = this.b;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                com.vk.im.ui.components.theme_chooser.b bVar = (com.vk.im.ui.components.theme_chooser.b) obj3;
                List list = (List) obj2;
                ThemeChooserState themeChooserState = (ThemeChooserState) obj;
                DialogBackground dialogBackground = themeChooserState.d;
                if (themeChooserState.f.isEmpty() || !dialogBackground.d()) {
                    String str = themeChooserState.b;
                    List<DialogBackground> list2 = themeChooserState.g;
                    bVar.getClass();
                    X0 = com.vk.im.ui.components.theme_chooser.b.X0(str, list, list2);
                } else {
                    X0 = dialogBackground;
                }
                ThemeChooserState a = ThemeChooserState.a(themeChooserState, null, null, null, X0, false, list, null, null, Sdk.SDKError.Reason.AD_RESPONSE_EMPTY_VALUE);
                if (X0 != dialogBackground) {
                    bVar.o.a(a);
                    break;
                }
                break;
            case 1:
                ExtendedUserProfile extendedUserProfile = (ExtendedUserProfile) obj3;
                rlq0 rlq0Var = (rlq0) obj2;
                if (((Boolean) obj).booleanValue()) {
                    extendedUserProfile.i0 = false;
                    break;
                } else {
                    break;
                }
            case 2:
                stq0 stq0Var = (stq0) obj3;
                ExtendedUserProfile extendedUserProfile2 = (ExtendedUserProfile) obj2;
                izs<? super com.vk.profile.user.impl.ui.b, s3q0> izsVar = stq0Var.f;
                if (izsVar == null) {
                    izsVar = null;
                }
                izsVar.invoke(new b.s(extendedUserProfile2, true, true));
                fpq0 fpq0Var = stq0Var.g;
                (fpq0Var != null ? fpq0Var : null).B(new f.h(new atq0.d(Integer.valueOf(R.string.user_profile_status_toast_opened), null, null, Integer.valueOf(R.drawable.vk_icon_check_circle_on_24), 0, null, null, 246)));
                break;
            case 3:
                VideoFile videoFile = (VideoFile) obj2;
                String str2 = (String) obj;
                mrc0 mrc0Var = ((com.vk.newsfeed.common.recycler.holders.i) obj3).o0;
                if (mrc0Var != null) {
                    ((wad0) mrc0Var.c).i6().sa(new NewsfeedExternalAction.Navigation.h(videoFile.I0(), videoFile.o0(), str2));
                    break;
                }
                break;
            case 4:
                List list3 = (List) obj2;
                VKImageView vKImageView = (VKImageView) obj3;
                VKImageView vKImageView2 = (VKImageView) obj;
                if (list3 != null) {
                    List<BaseImageDto> list4 = list3;
                    arrayList = new ArrayList(c5g.u(list4, 10));
                    for (BaseImageDto baseImageDto : list4) {
                        arrayList.add(new ImageSize(baseImageDto.getUrl(), baseImageDto.getWidth(), baseImageDto.getHeight(), baseImageDto.e(), (char) 0, false, 48, null));
                    }
                } else {
                    arrayList = null;
                }
                ImageSize Cb = new Image(arrayList).Cb(vKImageView2.getWidth(), true, false);
                vKImageView.load(Cb != null ? Cb.getUrl() : null);
                break;
            case 5:
                izs izsVar2 = (izs) obj2;
                ov70 ov70Var = (ov70) obj;
                ljo0 ljo0Var = (ljo0) ((wh50) obj3).getValue();
                if (ljo0Var != null) {
                    izsVar2.invoke(Integer.valueOf(ljo0Var.b.h(ov70Var.a)));
                }
                break;
            case 6:
                vuv0 vuv0Var = (vuv0) obj3;
                gzs gzsVar = (gzs) obj2;
                View view = (View) obj;
                f4m.t(vuv0Var.d.d((zs20) vuv0Var.m.getValue(), (zs20) vuv0Var.n.getValue()), view);
                TextView textView = view instanceof TextView ? (TextView) view : null;
                if (textView != null) {
                    textView.setText((CharSequence) gzsVar.invoke());
                }
                break;
            default:
                int i2 = l1x0.k1;
                TextView textView2 = ((l1x0.b) obj3).a;
                textView2.setText(((tlo0) obj).b(((l1x0) obj2).getResources()));
                textView2.setVisibility(0);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ cpo0(List list, VKImageView vKImageView) {
        this.b = 4;
        this.d = list;
        this.c = vKImageView;
    }
}
