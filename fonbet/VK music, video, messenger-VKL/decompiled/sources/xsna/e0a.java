package xsna;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.SparseArray;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.internal.cast.zzaz;
import com.vk.catalog2.common.dto.api.CatalogViewType;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketItem;
import com.vk.clips.sdk.models.ImageUrl;
import com.vk.clips.sdk.models.SdkImages;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.VideoFile;
import com.vk.libvideo.models.offline.VideoScreenMode;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetOptions;
import com.vk.music.player.PlaybackActionMeta;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import xsna.kan;

/* compiled from: com.google.android.gms:play-services-cast-framework@@22.3.1 */
/* loaded from: classes12.dex */
public final class e0a implements c46, xza0, sok0, lb9 {
    public final Object b;

    public /* synthetic */ e0a(Object obj) {
        this.b = obj;
    }

    @Override // xsna.c46
    @Nullable
    public Rect G() {
        com.google.android.gms.internal.mlkit_vision_barcode.zzq zzqVar = (com.google.android.gms.internal.mlkit_vision_barcode.zzq) this.b;
        if (zzqVar.zze == null) {
            return null;
        }
        int i = 0;
        int i2 = Integer.MIN_VALUE;
        int i3 = Integer.MAX_VALUE;
        int i4 = Integer.MAX_VALUE;
        int i5 = Integer.MIN_VALUE;
        while (true) {
            Point[] pointArr = zzqVar.zze;
            if (i >= pointArr.length) {
                return new Rect(i3, i4, i2, i5);
            }
            Point point = pointArr[i];
            i3 = Math.min(i3, point.x);
            i2 = Math.max(i2, point.x);
            i4 = Math.min(i4, point.y);
            i5 = Math.max(i5, point.y);
            i++;
        }
    }

    @Override // xsna.c46
    @Nullable
    public Point[] I() {
        return ((com.google.android.gms.internal.mlkit_vision_barcode.zzq) this.b).zze;
    }

    @Override // xsna.xza0
    public boolean M(boolean z, PlaybackActionMeta playbackActionMeta, String str) {
        return ((dx40) this.b).f(playbackActionMeta);
    }

    @Override // xsna.c46
    @Nullable
    public String R() {
        return ((com.google.android.gms.internal.mlkit_vision_barcode.zzq) this.b).zzb;
    }

    @Override // xsna.sok0
    public boolean S(UIBlockList uIBlockList) {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:156:0x043f, code lost:
    
        if (xsna.lan.b(r24) != false) goto L167;
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0442, code lost:
    
        r5 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:167:0x0454, code lost:
    
        if (xsna.lan.b(r24) != false) goto L167;
     */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, kotlin.Lazy] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public List T(s6s0 s6s0Var) {
        e520 a;
        int i;
        String str = s6s0Var.b;
        VideoFile videoFile = s6s0Var.a;
        if (epx.f(str, "VOIP_CALL_RECORDINGS")) {
            return rl3.I(new e520[]{uyo.c.a(s6s0Var), r6j0.c.a(s6s0Var), gwf0.c.a(s6s0Var)});
        }
        if (!g620.f().c(videoFile) && videoFile.F4().j()) {
            return rl3.I(new e520[]{r6j0.c.a(s6s0Var), i24.c.a(s6s0Var), f1h0.c.a(s6s0Var), v4g0.c.a(s6s0Var), gwf0.c.a(s6s0Var)});
        }
        if (BuildInfo.r()) {
            return rl3.I(new e520[]{lhs0.c.a(s6s0Var), pct0.c.a(s6s0Var), uyo.c.a(s6s0Var), wo0.c.a(s6s0Var), gxf0.c.a(s6s0Var), bxf0.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), n7j0.c.a(s6s0Var), v4g0.c.a(s6s0Var), zwf0.c.a(s6s0Var)});
        }
        if (!lan.a(s6s0Var)) {
            List<h6s0> list = (List) this.b.getValue();
            ArrayList arrayList = new ArrayList();
            for (h6s0 h6s0Var : list) {
                if (epx.f(h6s0Var, hmq.c)) {
                    a = h6s0Var.a(s6s0Var);
                } else {
                    a = epx.f(h6s0Var, i2q0.c) ? h6s0Var.a(s6s0Var) : h6s0Var.a(s6s0Var);
                    if (a != null) {
                        arrayList.add(a);
                    }
                }
            }
            return j5g.D0(new ig2(2), arrayList);
        }
        VideoScreenMode videoScreenMode = s6s0Var.u;
        if (videoFile.W9()) {
            i = videoScreenMode != null ? kan.a.$EnumSwitchMapping$0[videoScreenMode.ordinal()] : -1;
            if (i == 1) {
                return rl3.I(new e520[]{BuildInfo.s() ? jk0.c.a(s6s0Var) : null, hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), d770.c.a(s6s0Var), BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, v4g0.c.a(s6s0Var), i2q0.c.a(s6s0Var), gxf0.c.a(s6s0Var), BuildInfo.s() ? gwf0.c.a(s6s0Var) : null});
            }
            if (i == 2) {
                return rl3.I(new e520[]{kan.a(s6s0Var) ? zum0.d.a(s6s0Var) : null, BuildInfo.s() ? jk0.c.a(s6s0Var) : null, hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, v4g0.c.a(s6s0Var), i2q0.c.a(s6s0Var)});
            }
            if (i != 3) {
                return EmptyList.b;
            }
            return rl3.I(new e520[]{kan.a(s6s0Var) ? zum0.d.a(s6s0Var) : null, BuildInfo.s() ? jk0.c.a(s6s0Var) : null, hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, v4g0.c.a(s6s0Var), i2q0.c.a(s6s0Var)});
        }
        i = videoScreenMode != null ? kan.a.$EnumSwitchMapping$0[videoScreenMode.ordinal()] : -1;
        if (i == 1) {
            return rl3.I(new e520[]{k7k.c.a(s6s0Var), b14.c.a(s6s0Var), uyo.c.a(s6s0Var), i24.c.a(s6s0Var), BuildInfo.s() ? jk0.c.a(s6s0Var) : null, hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), !videoFile.t0() ? d770.c.a(s6s0Var) : null, BuildInfo.q() ? e770.c.a(s6s0Var) : null, BuildInfo.q() ? m3v.c.a(s6s0Var) : null, BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, !videoFile.t0() ? v4g0.c.a(s6s0Var) : null, i2q0.c.a(s6s0Var), gxf0.c.a(s6s0Var), BuildInfo.s() ? gwf0.c.a(s6s0Var) : null});
        }
        if (i == 2) {
            return rl3.I(new e520[]{kan.a(s6s0Var) ? zum0.d.a(s6s0Var) : null, k7k.c.a(s6s0Var), b14.c.a(s6s0Var), uyo.c.a(s6s0Var), lhs0.c.a(s6s0Var), u1t0.c.a(s6s0Var), e8s0.c.a(s6s0Var), i24.c.a(s6s0Var), BuildInfo.s() ? jk0.c.a(s6s0Var) : null, hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, kan.a(s6s0Var) ? o6q0.d.a(s6s0Var) : null, !videoFile.t0() ? v4g0.c.a(s6s0Var) : null, i2q0.c.a(s6s0Var), pct0.c.a(s6s0Var)});
        }
        if (i != 3) {
            return EmptyList.b;
        }
        return rl3.I(new e520[]{kan.a(s6s0Var) ? zum0.d.a(s6s0Var) : null, k7k.c.a(s6s0Var), b14.c.a(s6s0Var), uyo.c.a(s6s0Var), i24.c.a(s6s0Var), BuildInfo.s() ? jk0.c.a(s6s0Var) : null, lhs0.c.a(s6s0Var), u1t0.c.a(s6s0Var), e8s0.c.a(s6s0Var), hmq.c.a(s6s0Var), ftj.c.a(s6s0Var), r6j0.c.a(s6s0Var), wo0.c.a(s6s0Var), BuildInfo.q() ? n7j0.c.a(s6s0Var) : null, kan.a(s6s0Var) ? o6q0.d.a(s6s0Var) : null, !videoFile.t0() ? v4g0.c.a(s6s0Var) : null, i2q0.c.a(s6s0Var), pct0.c.a(s6s0Var)});
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public h6s0 U(e520 e520Var) {
        Object obj;
        int i = e520Var.a;
        Iterator it = ((List) this.b.getValue()).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((h6s0) obj).b == i) {
                break;
            }
        }
        h6s0 h6s0Var = (h6s0) obj;
        if (h6s0Var != null) {
            return h6s0Var;
        }
        if (i == VideoBottomSheetOptions.SUBSCRIBE.ordinal()) {
            return zum0.d;
        }
        if (i == VideoBottomSheetOptions.UNSUBSCRIBE.ordinal()) {
            return o6q0.d;
        }
        return null;
    }

    public ImageUrl V(SdkImages sdkImages) {
        Object obj;
        Iterator it = j5g.D0(new n2k(), sdkImages.b).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ojh0) this.b).a(((ImageUrl) obj).b)) {
                break;
            }
        }
        return (ImageUrl) obj;
    }

    public String W(SdkClipVideoFile sdkClipVideoFile) {
        ImageUrl b;
        ImageUrl V;
        String str;
        SdkImages e1 = sdkClipVideoFile.e1();
        if (e1 != null && (V = V(e1)) != null && (str = V.b) != null) {
            return str;
        }
        ImageUrl V2 = V(sdkClipVideoFile.getImage());
        if (V2 != null) {
            return V2.b;
        }
        SdkImages e12 = sdkClipVideoFile.e1();
        String str2 = (e12 == null || (b = e12.b(sdkClipVideoFile.getWidth())) == null) ? null : b.b;
        if (str2 != null) {
            return str2;
        }
        ImageUrl b2 = sdkClipVideoFile.getImage().b(sdkClipVideoFile.getWidth());
        String str3 = b2 != null ? b2.b : null;
        return str3 == null ? "" : str3;
    }

    public int X(@NonNull Object obj) {
        HashMap hashMap = (HashMap) this.b;
        if (hashMap.containsKey(obj)) {
            return ((Integer) hashMap.get(obj)).intValue();
        }
        int size = hashMap.size();
        hashMap.put(obj, Integer.valueOf(size));
        return size;
    }

    @Override // xsna.xza0
    public boolean f(PlaybackActionMeta playbackActionMeta) {
        return ((dx40) this.b).f(playbackActionMeta);
    }

    @Override // xsna.c46
    public int getFormat() {
        return ((com.google.android.gms.internal.mlkit_vision_barcode.zzq) this.b).zza;
    }

    @Override // xsna.sok0
    public int getSpanCount() {
        return 6;
    }

    @Override // xsna.xza0
    public float getVolume() {
        return ((dx40) this.b).C();
    }

    @Override // xsna.c46
    public int h() {
        return ((com.google.android.gms.internal.mlkit_vision_barcode.zzq) this.b).zzd;
    }

    @Override // xsna.xza0
    public boolean j(int i, PlaybackActionMeta playbackActionMeta) {
        throw null;
    }

    @Override // xsna.xza0
    public boolean m(String str, int i, boolean z, boolean z2) {
        return ((dx40) this.b).pause(i);
    }

    @Override // xsna.lb9
    public void onFailure(okhttp3.d dVar, IOException iOException) {
        ((io.reactivex.rxjava3.core.r) this.b).b(iOException);
    }

    @Override // xsna.lb9
    public void onResponse(okhttp3.d dVar, okhttp3.u uVar) {
        io.reactivex.rxjava3.core.r rVar = (io.reactivex.rxjava3.core.r) this.b;
        int i = uVar.e;
        okhttp3.v vVar = uVar.h;
        long contentLength = vVar != null ? vVar.contentLength() : 0L;
        int i2 = i / 100;
        if ((i2 == 1 || i2 == 2 || i2 == 3) && ((contentLength > 0 || contentLength == -1) && vVar != null)) {
            rVar.onNext(vVar);
            rVar.onComplete();
            return;
        }
        if (vVar != null) {
            vVar.close();
        }
        rVar.b(new IllegalStateException("Incorrect response: " + i + " or length " + contentLength));
    }

    @Override // xsna.sok0
    public int q(UIBlock uIBlock) {
        if (!(uIBlock instanceof UIBlockMarketItem)) {
            return ((uIBlock instanceof UIBlockVideo) && ((UIBlockVideo) uIBlock).d == CatalogViewType.SHORT_DOUBLE_STACKED_LIST) ? 3 : 6;
        }
        Context context = (Context) this.b;
        HashSet hashSet = iah0.a;
        return fnj.d(context) ? 2 : 3;
    }

    @Override // xsna.xza0
    public void setVolume(float f) {
        ((dx40) this.b).s(f);
    }

    @Override // xsna.xza0
    public void stop(int i) {
        ((dx40) this.b).stop(i);
    }

    public e0a(@NonNull Bundle bundle) {
        this.b = zzaz.zza(bundle, "com.google.android.gms.cast.MAP_CAST_STATUS_CODES_TO_CAST_REASON_CODES");
    }

    public e0a(int i) {
        switch (i) {
            case 11:
                this.b = new SparseArray();
                break;
            case 12:
                this.b = msy.a(LazyThreadSafetyMode.NONE, new s7c0(12));
                break;
            default:
                this.b = new HashMap();
                break;
        }
    }

    public e0a(b0m0 b0m0Var, io.reactivex.rxjava3.core.r rVar) {
        this.b = rVar;
    }
}
