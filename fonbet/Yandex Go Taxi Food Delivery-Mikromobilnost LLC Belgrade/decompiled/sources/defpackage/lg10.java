package defpackage;

import android.content.Context;
import android.net.Uri;
import com.bumptech.glide.load.resource.bitmap.j;
import org.webrtc.MediaStreamTrack;

/* loaded from: classes10.dex */
public final class lg10 implements q430 {
    public final /* synthetic */ int a;
    public final Context b;

    public lg10(Context context, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.b = context.getApplicationContext();
                break;
            case 2:
                this.b = context.getApplicationContext();
                break;
            default:
                this.b = context;
                break;
        }
    }

    @Override // defpackage.q430
    public final p430 a(Object obj, int i, int i2, mg70 mg70Var) {
        Long l;
        int i3 = this.a;
        Context context = this.b;
        switch (i3) {
            case 0:
                Uri uri = (Uri) obj;
                return new p430(new lp60(uri), new kg10(0, context, uri));
            case 1:
                Uri uri2 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
                    return null;
                }
                return new p430(new lp60(uri2), g0r.d(context, uri2, new g191(context.getContentResolver())));
            default:
                Uri uri3 = (Uri) obj;
                if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384 || (l = (Long) mg70Var.c(j.d)) == null || l.longValue() != -1) {
                    return null;
                }
                return new p430(new lp60(uri3), g0r.d(context, uri3, new ryh(3, context.getContentResolver())));
        }
    }

    @Override // defpackage.q430
    public final boolean b(Object obj) {
        switch (this.a) {
            case 0:
                return pkb1.f((Uri) obj);
            case 1:
                Uri uri = (Uri) obj;
                return pkb1.f(uri) && !uri.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
            default:
                Uri uri2 = (Uri) obj;
                return pkb1.f(uri2) && uri2.getPathSegments().contains(MediaStreamTrack.VIDEO_TRACK_KIND);
        }
    }
}
