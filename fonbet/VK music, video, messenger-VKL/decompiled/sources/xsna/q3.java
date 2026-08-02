package xsna;

import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.vk.clips.sdk.shared.item.static_ads.events.StaticAdsItemViewEvent;
import com.vk.core.view.components.p003switch.VkSwitchItem;
import com.vk.dto.profile.Address;
import com.vk.feed.design.view.newsfeed.dzen.header.DzenNewsHeader;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragmentOld;
import com.vk.photo.editor.features.filter.d;
import com.vk.stickers.roulette.StickersRouletteFragment;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.jvm.internal.Ref$ObjectRef;
import one.video.ad.ux.controls.OneVideoAdBaseControls;
import one.video.ad.ux.controls.OneVideoAdControlsViewNew;
import xsna.cs00;
import xsna.wqh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class q3 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ q3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v2, types: [T, android.view.View, xsna.b83] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((dw20) obj).dismiss();
                break;
            case 1:
                ((osa) obj).l.a();
                break;
            case 2:
                ((gzs) obj).invoke();
                break;
            case 3:
                arg argVar = (arg) obj;
                Context context = view.getContext();
                Address address = argVar.j;
                if (address != null) {
                    List r = m4s.r(argVar.a.getContext(), address.c, address.d);
                    List list = r;
                    if (list != null && !list.isEmpty()) {
                        j6e j6eVar = new j6e(argVar, 6);
                        Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
                        c83 c83Var = new c83(context, ref$ObjectRef);
                        c83Var.setOnDismissListener(new x73(c83Var, ref$ObjectRef));
                        ?? b83Var = new b83(context, r, j6eVar, c83Var);
                        c83Var.setContentView((View) b83Var);
                        ref$ObjectRef.element = b83Var;
                        c83Var.setCancelable(true);
                        c83Var.n(3);
                        c83Var.r = 4;
                        c83Var.Ng();
                        c83Var.show();
                        break;
                    } else {
                        cvk.u(R.string.error, false);
                        break;
                    }
                }
                break;
            case 4:
                int i2 = DzenNewsHeader.C;
                ((DzenNewsHeader.b.a) obj).d.invoke();
                break;
            case 5:
                int i3 = LocalMediaPickerFragmentOld.c0;
                efc0 fo = ((LocalMediaPickerFragmentOld) obj).fo();
                if (fo != null) {
                    fo.C(new PostingAction.MediaPicker.SheetTransition(MediaPickerState.SheetState.Hidden));
                    break;
                }
                break;
            case 6:
                zr00 zr00Var = (zr00) obj;
                xr00 xr00Var = zr00Var.v;
                if (xr00Var != null) {
                    zr00Var.l.a(new cs00.b(xr00Var.b));
                    break;
                }
                break;
            case 7:
                hv20<?> hv20Var = ((fv20) obj).r1;
                if (hv20Var == null) {
                    hv20Var = null;
                }
                hv20Var.L2();
                break;
            case 8:
                int i4 = OneVideoAdControlsViewNew.E;
                OneVideoAdBaseControls.a listener = ((OneVideoAdControlsViewNew) obj).getListener();
                if (listener != null) {
                    listener.d();
                    break;
                }
                break;
            case 9:
                gjb0 gjb0Var = (gjb0) obj;
                if (gjb0Var != null) {
                    gjb0Var.m7();
                    break;
                }
                break;
            case 10:
                com.vk.music.notifications.inapp.c cVar = (com.vk.music.notifications.inapp.c) obj;
                if (cVar.C()) {
                    cVar.d();
                    break;
                }
                break;
            case 11:
                ((orh0) obj).d.C(wqh0.j.b);
                break;
            case 12:
                ((awk0) obj).a.a(StaticAdsItemViewEvent.g.b);
                break;
            case 13:
                int i5 = StickersRouletteFragment.o0;
                ((StickersRouletteFragment) obj).finish();
                break;
            case 14:
                Toast.makeText(((b5p0) obj).itemView.getContext(), "Out click!", 0).show();
                break;
            case 15:
                v8p0 v8p0Var = (v8p0) obj;
                d.c cVar2 = v8p0Var.l;
                if (cVar2 != null) {
                    cVar2.invoke(v8p0Var);
                    break;
                }
                break;
            case 16:
                int i6 = VkSwitchItem.f;
                ((VkSwitchItem) obj).toggle();
                break;
            default:
                ((m5o0) obj).invoke();
                break;
        }
    }
}
