package xsna;

import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.FragmentActivity;
import com.vk.attachpicker.screen.a;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.mediastore.system.MediaStoreImageEntry;
import com.vk.mediastore.system.MediaStoreVideoEntry;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.LocalMediaEntry;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaViewerOpenPoint;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.u2u0;
import xsna.xn50;

/* compiled from: MediaViewer.kt */
/* loaded from: classes4.dex */
public final class x020 {
    public final PostingFragment a;
    public final cpc0 b;
    public final hj60 c;
    public final h3k0 d;
    public com.vk.core.simplescreen.a e;
    public com.vk.attachpicker.screen.p f;
    public boolean g;
    public a.c i;
    public MediaStoreEntry j;
    public final LinkedHashMap h = new LinkedHashMap();
    public final y020 k = new y020(this);
    public final b120 l = new b120(this);

    /* compiled from: MediaViewer.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[MediaViewerOpenPoint.values().length];
            try {
                iArr[MediaViewerOpenPoint.LOCAL_MEDIA_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaViewerOpenPoint.VK_PHOTO_PICKER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaViewerOpenPoint.MEDIA_PREVIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaViewerOpenPoint.MINI_MEDIA_PREVIEW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public x020(PostingFragment postingFragment, cpc0 cpc0Var, hj60 hj60Var, h3k0 h3k0Var) {
        this.a = postingFragment;
        this.b = cpc0Var;
        this.c = hj60Var;
        this.d = h3k0Var;
    }

    public static PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection a(MediaStoreEntry mediaStoreEntry) {
        LocalMediaEntry video;
        if (mediaStoreEntry instanceof MediaStoreImageEntry) {
            video = new LocalMediaEntry.Image((MediaStoreImageEntry) mediaStoreEntry);
        } else {
            if (!(mediaStoreEntry instanceof MediaStoreVideoEntry)) {
                throw new NoWhenBranchMatchedException();
            }
            video = new LocalMediaEntry.Video((MediaStoreVideoEntry) mediaStoreEntry);
        }
        return new PostingAction.MediaPicker.Selection.ToggleLocalMediaItemSelection(new MediaPickerSelectedItem.LocalMedia(video), SystemClock.elapsedRealtime());
    }

    public final void b(PostingAction.MediaPicker mediaPicker, ActionsAvailabilityState.Availability availability) {
        boolean z = availability instanceof ActionsAvailabilityState.Availability.NotAvailable;
        PostingFragment postingFragment = this.a;
        if (!z) {
            xn50.a.c(postingFragment, mediaPicker);
            return;
        }
        PostingUserMessage postingUserMessage = ((ActionsAvailabilityState.Availability.NotAvailable) availability).b;
        if (postingUserMessage != null) {
            xn50.a.c(postingFragment, new PostingAction.ShowMessage(postingUserMessage, mediaPicker, 0, 0, 0, 0, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE, null));
        }
    }

    public final void c(FragmentActivity fragmentActivity, ArrayList arrayList, List list, int i, MediaViewerOpenPoint mediaViewerOpenPoint, boolean z, boolean z2, u2u0 u2u0Var) {
        FragmentActivity fragmentActivity2;
        View decorView;
        View decorView2;
        View decorView3;
        View decorView4;
        View decorView5;
        View decorView6;
        com.vk.core.simplescreen.a aVar = this.e;
        if (aVar == null) {
            fragmentActivity2 = fragmentActivity;
            aVar = new com.vk.core.simplescreen.a(fragmentActivity2, false, true);
            this.e = aVar;
            aVar.setOnDismissListener(new w020(this));
        } else {
            fragmentActivity2 = fragmentActivity;
        }
        Window window = fragmentActivity2.getWindow();
        f5z e = (window == null || (decorView6 = window.getDecorView()) == null) ? null : gqo.e(decorView6);
        Window window2 = fragmentActivity2.getWindow();
        xyt0 h = (window2 == null || (decorView5 = window2.getDecorView()) == null) ? null : ro.h(decorView5);
        Window window3 = fragmentActivity2.getWindow();
        z1h0 f = (window3 == null || (decorView4 = window3.getDecorView()) == null) ? null : lyd.f(decorView4);
        Window window4 = aVar.getWindow();
        if (window4 != null && (decorView3 = window4.getDecorView()) != null) {
            gqo.f(decorView3, e);
        }
        Window window5 = aVar.getWindow();
        if (window5 != null && (decorView2 = window5.getDecorView()) != null) {
            ro.o(decorView2, h);
        }
        Window window6 = aVar.getWindow();
        if (window6 != null && (decorView = window6.getDecorView()) != null) {
            lyd.h(decorView, f);
        }
        Window window7 = aVar.getWindow();
        if (window7 != null) {
            window7.addFlags(134217728);
        }
        aVar.show();
        Window window8 = aVar.getWindow();
        com.vk.attachpicker.c cVar = new com.vk.attachpicker.c();
        cVar.c = new z020();
        if (z && list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                Pair pair = (Pair) it.next();
                cVar.f(((Number) pair.i()).intValue(), null, (MediaStoreEntry) pair.j());
            }
        }
        int i2 = 4;
        com.vk.attachpicker.screen.p pVar = new com.vk.attachpicker.screen.p(p4g.q(arrayList), i, cVar, this.l, true, !z2, true, 0L, 0L, 0L, false, false, arrayList.size(), true, aVar, null, null, false, null, this.k, new com.vk.attachpicker.screen.k(z, z2, window8, new o15(this, mediaViewerOpenPoint, arrayList, i2), new zle(this, arrayList, aVar, i2), new k82(15, u2u0Var, this), epx.f(u2u0Var, u2u0.b.a) ? null : new dfc0(this.d)));
        pVar.U = this.k;
        pVar.P = false;
        pVar.j.b = false;
        aVar.b(pVar);
        pVar.K();
        pVar.e.setFitsSystemWindows(true);
        this.f = pVar;
    }
}
