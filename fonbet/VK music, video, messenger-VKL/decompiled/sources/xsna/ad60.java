package xsna;

import android.view.ViewGroup;
import com.vk.dto.newsfeed.SituationalSuggest;
import xsna.ct60;

/* compiled from: NewsfeedBackstageSitpostingPlugin.kt */
/* loaded from: classes4.dex */
public final class ad60 {
    public final at60 a;
    public final io.reactivex.rxjava3.disposables.b b;
    public final ct60.b c;
    public gsr d;
    public ViewGroup e;
    public yc60 f;
    public int g;
    public int h;

    public ad60(at60 at60Var, io.reactivex.rxjava3.disposables.b bVar, ct60.b bVar2) {
        this.a = at60Var;
        this.b = bVar;
        this.c = bVar2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0018, code lost:
    
        r2 = r3.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0020, code lost:
    
        r3 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0021, code lost:
    
        if (r0 != false) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0023, code lost:
    
        r4 = r7.j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0025, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
    
        r3 = r4.c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002f, code lost:
    
        r4 = r1.g;
        r1 = r1.h;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0033, code lost:
    
        if (r1 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0035, code lost:
    
        xsna.bwt0.p0(r1, !r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x003a, code lost:
    
        if (r4 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        xsna.bwt0.p0(r4, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x003f, code lost:
    
        if (r3 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0042, code lost:
    
        r4 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0043, code lost:
    
        if (r4 == null) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0045, code lost:
    
        r4.load(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x002a, code lost:
    
        r4 = r7.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x002c, code lost:
    
        if (r4 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x001d, code lost:
    
        if (r3 != null) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0016, code lost:
    
        if (r3 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(SituationalSuggest situationalSuggest) {
        SituationalSuggest.PlaceholderStyle placeholderStyle;
        SituationalSuggest.SituationalImage situationalImage;
        boolean M = dhr0.M();
        gsr gsrVar = this.d;
        if (gsrVar != null) {
            String str = null;
            if (M) {
                situationalImage = situationalSuggest.k;
                if ((situationalImage != null ? situationalImage.b : null) != null) {
                }
            }
            situationalImage = situationalSuggest.j;
        }
        gsr gsrVar2 = this.d;
        if (gsrVar2 != null) {
            gsrVar2.setTitleText(situationalSuggest.d);
        }
        gsr gsrVar3 = this.d;
        if (gsrVar3 != null) {
            gsrVar3.setActionText(situationalSuggest.e);
        }
        if (!M || (placeholderStyle = situationalSuggest.m) == null) {
            placeholderStyle = situationalSuggest.l;
        }
        if (placeholderStyle != null) {
            gsr gsrVar4 = this.d;
            if (gsrVar4 != null) {
                gsrVar4.setTitleTextColor(placeholderStyle.d);
            }
            gsr gsrVar5 = this.d;
            if (gsrVar5 != null) {
                gsrVar5.setActionTextColor(placeholderStyle.e);
            }
            gsr gsrVar6 = this.d;
            if (gsrVar6 != null) {
                gsrVar6.setBackgroundViewColor(placeholderStyle.b);
            }
            gsr gsrVar7 = this.d;
            if (gsrVar7 != null) {
                gsrVar7.setCloseButtonColor(placeholderStyle.c);
            }
        }
    }

    public final void b() {
        yc60 yc60Var = this.f;
        if (yc60Var != null) {
            dhr0.a.d(yc60Var);
        }
        this.f = null;
    }
}
