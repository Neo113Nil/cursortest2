package xsna;

import android.view.View;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.fh3;
import xsna.fi3;

/* compiled from: ArchiveBannerAdapterDelegate.kt */
/* loaded from: classes15.dex */
public final class kg3 extends vfz<fi3.a> {
    public final gzs<s3q0> l;
    public final boolean m;
    public final TextView n;
    public final TextView o;

    public kg3(View view, fh3.c cVar, boolean z) {
        super(view);
        this.l = cVar;
        this.m = z;
        this.n = (TextView) view.findViewById(R.id.archiveBannerTitle);
        this.o = (TextView) view.findViewById(R.id.archiveBannerContent);
        view.setClipToOutline(true);
        view.setOutlineProvider(new s0w0(cn70.b(8), 6));
        View findViewById = view.findViewById(R.id.archiveBannerHideButton);
        findViewById.setClipToOutline(true);
        findViewById.setOutlineProvider(p0w0.a);
        findViewById.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 254));
        bwt0.i0(findViewById, new zx0(this, 3));
    }

    @Override // xsna.vfz
    /* renamed from: W5 */
    public final void h6(fi3.a aVar) {
        boolean z = this.m;
        TextView textView = this.o;
        TextView textView2 = this.n;
        if (z) {
            at.d(this.itemView, R.string.vkim_archive_communities_banner_title, textView2);
            at.d(this.itemView, R.string.vkim_archive_communities_banner_content, textView);
        } else {
            at.d(this.itemView, R.string.vkim_archive_channel_banner_title, textView2);
            at.d(this.itemView, R.string.vkim_archive_channel_banner_content, textView);
        }
    }
}
