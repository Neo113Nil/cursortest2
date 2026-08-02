package xsna;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.feed.core.models.news.NewsEntry;
import com.vkontakte.android.attachments.VideoAttachment;
import java.util.WeakHashMap;
import kotlin.Triple;

/* compiled from: DefaultContextPropagators.java */
/* loaded from: classes11.dex */
public final class bdl implements gpj {
    public static final bdl b = new bdl(0);
    public final /* synthetic */ int a;

    public /* synthetic */ bdl(int i) {
        this.a = i;
    }

    @NonNull
    public static wuj a(int i) {
        return i != 0 ? i != 1 ? new wog0() : new upk() : new wog0();
    }

    public static r74 b(int i, NewsEntry newsEntry, NewsEntry newsEntry2, VideoAttachment videoAttachment) {
        r74 r74Var = new r74(i, videoAttachment, newsEntry, newsEntry2);
        r74Var.h = (ol60) j5g.a0(new cdi().L(0, new Triple(newsEntry, videoAttachment, Integer.valueOf(i))));
        return r74Var;
    }

    public static final svx0 c(fxx0 fxx0Var) {
        return new svx0(fxx0Var.a, fxx0Var.t);
    }

    public static void d(@NonNull ViewGroup viewGroup, float f) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            ((MaterialShapeDrawable) background).setElevation(f);
        }
    }

    public static void e(@NonNull View view, @NonNull MaterialShapeDrawable materialShapeDrawable) {
        if (materialShapeDrawable.isElevationOverlayEnabled()) {
            float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            for (ViewParent parent = view.getParent(); parent instanceof View; parent = parent.getParent()) {
                WeakHashMap<View, b0u0> weakHashMap = iut0.a;
                f += ((View) parent).getElevation();
            }
            materialShapeDrawable.setParentAbsoluteElevation(f);
        }
    }

    public static void f(@NonNull ViewGroup viewGroup) {
        Drawable background = viewGroup.getBackground();
        if (background instanceof MaterialShapeDrawable) {
            e(viewGroup, (MaterialShapeDrawable) background);
        }
    }

    public String toString() {
        switch (this.a) {
            case 0:
                return "DefaultContextPropagators{textMapPropagator=" + z4g.d + "}";
            default:
                return super.toString();
        }
    }
}
