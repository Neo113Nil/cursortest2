package xsna;

import android.content.res.Resources;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import com.facebook.drawee.generic.RoundingParams;
import com.unity3d.services.UnityAdsConstants;
import java.util.Iterator;
import java.util.List;
import xsna.f5h0;

/* compiled from: GenericDraweeHierarchyBuilder.java */
/* loaded from: classes.dex */
public final class ojt {
    public static final f5h0.g r = f5h0.g.a;
    public static final f5h0.f s = f5h0.f.a;
    public final Resources a;
    public int b = 300;
    public float c = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    public Drawable d = null;
    public f5h0.d e;
    public Drawable f;
    public f5h0.d g;
    public Drawable h;
    public f5h0.d i;
    public Drawable j;
    public f5h0.d k;
    public f5h0.d l;
    public PointF m;
    public Drawable n;
    public List<Drawable> o;
    public StateListDrawable p;
    public RoundingParams q;

    public ojt(Resources resources) {
        this.a = resources;
        f5h0.g gVar = r;
        this.e = gVar;
        this.f = null;
        this.g = gVar;
        this.h = null;
        this.i = gVar;
        this.j = null;
        this.k = gVar;
        this.l = s;
        this.m = null;
        this.n = null;
        this.o = null;
        this.p = null;
        this.q = null;
    }

    public final njt a() {
        List<Drawable> list = this.o;
        if (list != null) {
            Iterator<Drawable> it = list.iterator();
            while (it.hasNext()) {
                it.next().getClass();
            }
        }
        return new njt(this);
    }
}
