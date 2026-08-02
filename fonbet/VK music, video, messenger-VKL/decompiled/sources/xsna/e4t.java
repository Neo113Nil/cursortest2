package xsna;

import android.graphics.Bitmap;
import android.view.View;
import com.vk.api.base.VkPaginationList;
import com.vk.api.generated.orders.dto.OrdersOrderDto;
import com.vk.attachpicker.adapter.PhotoSmallAdapter;
import com.vk.attachpicker.b;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.dto.common.data.VKList;
import com.vk.dto.masks.SmartMasksGetModelResponse;
import com.vk.dto.music.PlaylistLink;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachLocationFragment;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlin.text.Regex;
import xsna.nf60;
import xsna.xex0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class e4t implements b.d, io.reactivex.rxjava3.functions.l, io.reactivex.rxjava3.functions.m, io.reactivex.rxjava3.functions.h, whp, io.reactivex.rxjava3.functions.c, i0u0, yads.ng1 {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ e4t(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.vk.catalog2.common.ui.mvp.holder.CatalogRootViewHolder, xsna.n0i0] */
    @Override // xsna.whp
    public String a() {
        return ((wzh0) this.c).b.e6();
    }

    @Override // io.reactivex.rxjava3.functions.l
    public Object apply(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 1:
                return (OrdersOrderDto.StatusDto) ((eit) obj2).invoke(obj);
            case 2:
                return (Boolean) ((qm0) obj2).invoke(obj);
            case 3:
            case 4:
            case 6:
            case 12:
            case 13:
            case 15:
            case 16:
            case 17:
            case 20:
            case 21:
            default:
                return ((xex0.e) obj2).invoke(obj);
            case 5:
                return (PlaylistLink) ((z410) obj2).invoke(obj);
            case 7:
                return (tl60) ((aq1) obj2).invoke(obj);
            case 8:
                return (mch0) ((b95) obj2).invoke(obj);
            case 9:
                return (String) ((oma0) obj2).invoke(obj);
            case 10:
                int i2 = PostingAttachLocationFragment.I0;
                return (VkPaginationList) ((gcc0) obj2).invoke(obj);
            case 11:
                return (io.reactivex.rxjava3.core.b0) ((aq1) obj2).invoke(obj);
            case 14:
                return (Bitmap) ((azt) obj2).invoke(obj);
            case 18:
                return (VKList) ((r6i0) obj2).invoke(obj);
            case 19:
                return (u490) ((izs) obj2).invoke(obj);
            case 22:
                return (Post) ((sx4) obj2).invoke(obj);
        }
    }

    @Override // com.vk.attachpicker.b.d
    public List e() {
        return ((PhotoSmallAdapter) this.c).L0();
    }

    @Override // io.reactivex.rxjava3.functions.h
    public Object f(Object obj, Object obj2, Object obj3, Object obj4) {
        return (nf60.a) ((ioi) this.c).invoke(obj, obj2, obj3, obj4);
    }

    @Override // xsna.i0u0
    public View get() {
        return (View) new WeakReference(((vrq0) this.c).y).get();
    }

    @Override // yads.ng1
    public void invoke(Object obj) {
        ((yads.nf2) obj).onCues((List) this.c);
    }

    @Override // io.reactivex.rxjava3.functions.m
    public boolean test(Object obj) {
        int i = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 3:
                break;
            case 4:
                break;
            case 16:
                break;
            default:
                Regex regex = VkAuthPhoneView.q;
                break;
        }
        return ((Boolean) ((r6i0) obj2).invoke(obj)).booleanValue();
    }

    @Override // io.reactivex.rxjava3.functions.c
    public Object apply(Object obj, Object obj2) {
        switch (this.b) {
            case 13:
                return (SmartMasksGetModelResponse) ((j21) this.c).invoke(obj, obj2);
            case 14:
            default:
                return (List) ((j21) this.c).invoke(obj, obj2);
            case 15:
                return (tnm0) ((hue) this.c).invoke(obj, obj2);
        }
    }
}
