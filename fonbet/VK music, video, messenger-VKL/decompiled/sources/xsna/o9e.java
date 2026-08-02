package xsna;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewParent;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.media.ok.IClipsGalleryPicker;
import com.vk.media.ok.b;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;

/* compiled from: ClipsGalleryRecyclerWrapper.kt */
/* loaded from: classes16.dex */
public final class o9e implements IClipsGalleryPicker {
    public final RecyclerView a;
    public final View b;
    public final FrameLayout c;
    public final dm9 d;
    public final f3t e;
    public final HashMap<Uri, Integer> f = new HashMap<>();
    public IClipsGalleryPicker.MediaType g = IClipsGalleryPicker.MediaType.PHOTO_AND_VIDEO;
    public io.reactivex.rxjava3.disposables.c h;
    public List<? extends hfz> i;
    public List<? extends hfz> j;

    /* compiled from: ClipsGalleryRecyclerWrapper.kt */
    public static final class a {
    }

    /* compiled from: ClipsGalleryRecyclerWrapper.kt */
    public static final /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[IClipsGalleryPicker.MediaType.values().length];
            try {
                iArr[IClipsGalleryPicker.MediaType.PHOTO_AND_VIDEO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[IClipsGalleryPicker.MediaType.PHOTO.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[IClipsGalleryPicker.MediaType.VIDEO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public o9e(RecyclerView recyclerView, View view, FrameLayout frameLayout, dm9 dm9Var) {
        this.a = recyclerView;
        this.b = view;
        this.c = frameLayout;
        this.d = dm9Var;
        EmptyList emptyList = EmptyList.b;
        this.i = emptyList;
        this.j = emptyList;
        recyclerView.getContext();
        f3t f3tVar = new f3t(new szj0(), new n9b(1, this, o9e.class, "onNewItemSelected", "onNewItemSelected(I)V", 0, 1));
        this.e = f3tVar;
        float b2 = y8g0.b(R.dimen.effect_list_item_size) / 2;
        qcy<Object>[] qcyVarArr = bwt0.a;
        recyclerView.setClipToOutline(true);
        recyclerView.setOutlineProvider(new u0w0(b2, true));
        recyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(f3tVar);
    }

    public static int c(IClipsGalleryPicker.MediaType mediaType) {
        int i = b.$EnumSwitchMapping$0[mediaType.ordinal()];
        if (i == 1) {
            return 111;
        }
        if (i == 2) {
            return Sdk.SDKError.Reason.INVALID_WATERFALL_PLACEMENT_ID_VALUE;
        }
        if (i == 3) {
            return 333;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // com.vk.media.ok.IClipsGalleryPicker
    public final void a(b.f fVar) {
        this.e.k = fVar;
    }

    @Override // com.vk.media.ok.IClipsGalleryPicker
    public final void b(IClipsGalleryPicker.MediaType mediaType) {
        this.g = mediaType;
        this.c.setVisibility(0);
        EmptyList emptyList = EmptyList.b;
        e(emptyList);
        RecyclerView recyclerView = this.a;
        recyclerView.scrollToPosition(0);
        f3t f3tVar = this.e;
        f3tVar.j.invoke(Integer.valueOf(f3tVar.o));
        f3tVar.o = -1;
        f3tVar.m = true;
        Context context = recyclerView.getContext();
        f3tVar.l = false;
        yz10 a2 = iz10.a(context);
        d(emptyList);
        io.reactivex.rxjava3.disposables.c subscribe = io.reactivex.rxjava3.core.q.e0(0, 50).w(new rx0(new n9e(a2, c(this.g), 0), 8)).r0(io.reactivex.rxjava3.schedulers.a.b()).a0(io.reactivex.rxjava3.android.schedulers.a.b()).C(new p98(this, 2)).subscribe(new mp0(new wl0(this, 19), 11));
        hg1.b(recyclerView, subscribe);
        this.h = subscribe;
    }

    public final void d(List<? extends hfz> list) {
        this.j = list;
        this.e.setItems(j5g.u0(list, this.i));
    }

    public final void e(List<? extends hfz> list) {
        this.i = list;
        this.e.setItems(j5g.u0(this.j, list));
        this.a.scrollToPosition(0);
        f();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void f() {
        boolean h = f4m.h(this.c);
        int a2 = y8g0.a(R.dimen.effect_list_item_size) * (this.e.h.size() + (h ? 1 : 0));
        View view = this.b;
        ViewParent parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        int width = (view2 != null ? view2.getWidth() : 0) - (y8g0.a(R.dimen.camera_masks_mask_list_margin_start_default) * 2);
        RecyclerView recyclerView = this.a;
        if (anj.a(recyclerView.getContext(), Build.VERSION.SDK_INT >= 33 ? "android.permission.READ_MEDIA_IMAGES" : "android.permission.READ_EXTERNAL_STORAGE") == 0 && h) {
            view.getLayoutParams().width = -1;
            f4m.w(y8g0.a(R.dimen.gallery_list_padding_end), view);
        } else {
            view.getLayoutParams().width = Math.min(a2, width) + (h ? y8g0.a(R.dimen.effect_list_item_margin_dp) * 2 : 0);
            f4m.w(0, view);
        }
        recyclerView.getLayoutParams().width = a2 <= width ? -2 : -1;
    }
}
