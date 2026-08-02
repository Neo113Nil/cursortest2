package xsna;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.media3.transformer.ExportException;
import androidx.media3.transformer.b0;
import com.vk.api.base.VkPaginationList;
import com.vk.dto.attaches.AttachmentsArrangementConfig;
import com.vk.im.popup.Popup;
import com.vk.im.ui.components.common.PinnedMsgAction;
import com.vk.libvideo.ui.preview.VideoSeekPreviewImage;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import xsna.n8z0;
import xsna.qav;
import xsna.wfu;
import xsna.y490;
import xsna.ymq0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class yzt implements io.reactivex.rxjava3.functions.c, io.reactivex.rxjava3.functions.l, kxc0, Toolbar.h, n8z0.b, io.reactivex.rxjava3.functions.b, io.reactivex.rxjava3.functions.m, j7j, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yzt(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.j7j
    public void accept(Object obj) {
        ((b0.c) this.c).a((ExportException) obj);
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (kiu) ((ve0) obj2).invoke(obj);
            case 4:
                return (io.reactivex.rxjava3.core.b0) ((f0z) obj2).invoke(obj);
            case 6:
                return (io.reactivex.rxjava3.core.b0) ((z5a) obj2).invoke(obj);
            case 8:
                return (Boolean) ((oi40) obj2).invoke(obj);
            case 11:
                return (AttachmentsArrangementConfig) ((bee) obj2).invoke(obj);
            case 13:
                return (xwj0) ((oi40) obj2).invoke(obj);
            case 15:
                return (VkPaginationList) ((oi40) obj2).invoke(obj);
            case 18:
                return (Pair) ((j6l0) obj2).invoke(obj);
            case 19:
                return (List) ((oi40) obj2).invoke(obj);
            case 22:
                int i2 = VideoSeekPreviewImage.G;
                return (io.reactivex.rxjava3.core.t) ((j6l0) obj2).invoke(obj);
            case 23:
                return (io.reactivex.rxjava3.core.t) ((dov0) obj2).invoke(obj);
            default:
                return (Boolean) ((iiu0) obj2).invoke(obj);
        }
    }

    @Override // xsna.n8z0.b
    public void f(njz0 njz0Var, xla xlaVar) {
        ((zu50) this.c).c((rjz0) njz0Var, xlaVar);
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).onPlaybackStateChanged(((yads.df2) this.c).e);
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        m140 m140Var = (m140) this.c;
        if (menuItem.getItemId() != R.id.more) {
            return false;
        }
        com.vk.im.popup.a aVar = (com.vk.im.popup.a) m140Var.d.getValue();
        View findViewById = m140Var.c.findViewById(R.id.more);
        ArrayList arrayList = new ArrayList();
        PinnedMsgAction pinnedMsgAction = PinnedMsgAction.SHOW;
        p4g.a(pinnedMsgAction, arrayList, !m140Var.e);
        PinnedMsgAction pinnedMsgAction2 = PinnedMsgAction.HIDE;
        p4g.a(pinnedMsgAction2, arrayList, m140Var.e);
        PinnedMsgAction pinnedMsgAction3 = PinnedMsgAction.UNPIN;
        p4g.a(pinnedMsgAction3, arrayList, m140Var.f);
        s3q0 s3q0Var = s3q0.a;
        Popup.g.a aVar2 = new Popup.g.a(findViewById);
        Context context = findViewById.getContext();
        bpn0 bpn0Var = enj.a;
        Drawable mutate = e3m.e(R.attr.im_ic_pinned_msg_show, context).mutate();
        mutate.setTint(e3m.f(R.attr.vk_ui_icon_accent, context));
        lwb0 lwb0Var = new lwb0(null, R.string.vkim_dialog_option_pinned_msg_show, mutate, null, 0, pinnedMsgAction, false, null, false, false, 2009);
        Context context2 = findViewById.getContext();
        Drawable mutate2 = e3m.e(R.attr.im_ic_pinned_msg_hide, context2).mutate();
        mutate2.setTint(e3m.f(R.attr.vk_ui_icon_accent, context2));
        lwb0 lwb0Var2 = new lwb0(null, R.string.vkim_dialog_option_pinned_msg_hide, mutate2, null, 0, pinnedMsgAction2, false, null, false, false, 2009);
        Context context3 = findViewById.getContext();
        Drawable mutate3 = e3m.e(R.attr.im_ic_pinned_msg_detach, context3).mutate();
        mutate3.setTint(e3m.f(R.attr.vk_ui_icon_accent, context3));
        aVar.c(new noa0(e43.l(lwb0Var, lwb0Var2, new lwb0(null, R.string.vkim_dialog_option_pinned_msg_detach, mutate3, null, 0, pinnedMsgAction3, false, null, false, false, 2009)), arrayList, aVar2, 2431), new r820(m140Var, 5), null);
        return false;
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        switch (this.b) {
            case 14:
                return ((Boolean) ((oi40) this.c).invoke(obj)).booleanValue();
            case 24:
                return ((Boolean) ((j6l0) this.c).invoke(obj)).booleanValue();
            default:
                return ((Boolean) ((iiu0) this.c).invoke(obj)).booleanValue();
        }
    }

    @Override // io.reactivex.rxjava3.functions.b
    public void accept(Object obj, Object obj2) {
        ((ud6) this.c).invoke(obj, obj2);
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 0:
                return (ca7) ((z9g) this.c).invoke(obj, obj2);
            case 2:
                return (qav.b) ((x76) this.c).invoke(obj, obj2);
            case 5:
                return (Pair) ((z9g) this.c).invoke(obj, obj2);
            case 10:
                return (wfu.a.b) ((y490.b) this.c).invoke(obj, obj2);
            case 17:
                return (ymq0.a) ((z9g) this.c).invoke(obj, obj2);
            case 20:
                return (fns0) ((z9g) this.c).invoke(obj, obj2);
            default:
                return (Pair) ((wzs) this.c).invoke(obj, obj2);
        }
    }

    @Override // xsna.kxc0
    /* renamed from: apply, reason: collision with other method in class */
    public boolean mo429apply(Object obj) {
        return ((ww8) obj).c((Uri) this.c);
    }
}
