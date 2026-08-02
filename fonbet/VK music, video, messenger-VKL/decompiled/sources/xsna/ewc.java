package xsna;

import android.content.Context;
import android.net.Uri;
import com.vk.clips.sdk.shared.api.deps.video.SdkClipVideoFile;
import com.vk.dto.common.ClipVideoFile;
import com.vk.video.growth.api.TrapContentParams;
import com.vk.video.growth.api.VideoGrowthStoreParams;
import com.vk.video.growth.api.VideoGrowthTrapArguments;
import com.vk.video.growth.api.data.VideoGrowthVideoParams;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import xsna.olh0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class ewc implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ ewc(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        int i = this.b;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.c;
        switch (i) {
            case 0:
                SdkClipVideoFile sdkClipVideoFile = (SdkClipVideoFile) obj5;
                nlh0 nlh0Var = (nlh0) obj4;
                gwc gwcVar = (gwc) obj3;
                pd pdVar = (pd) obj2;
                ConcurrentHashMap.KeySetView keySetView = zed.a;
                ClipVideoFile z = k15.z(sdkClipVideoFile);
                z.X1 = true;
                zed.a.add(z.a1());
                nlh0Var.d(Collections.singletonList(new olh0.b(true)));
                if (sdkClipVideoFile.J()) {
                    yks0.g(tci.w(nlh0Var), gwcVar.f, null, 6);
                } else if (sdkClipVideoFile.o9()) {
                    pdVar.invoke(sdkClipVideoFile);
                }
                break;
            default:
                final x1e0 x1e0Var = (x1e0) obj5;
                final VideoGrowthVideoParams videoGrowthVideoParams = (VideoGrowthVideoParams) obj4;
                final yos0 yos0Var = (yos0) obj3;
                final Context context = (Context) obj2;
                final yns0 yns0Var = (yns0) obj;
                if (!yns0Var.equals(yns0.g)) {
                    Uri parse = Uri.parse(yns0Var.b);
                    Field field = mcr0.a;
                    new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.e(new mh40(new u0n(parse, 4), 18)).q(io.reactivex.rxjava3.schedulers.a.b()).o(io.reactivex.rxjava3.android.schedulers.a.b()), io.reactivex.rxjava3.internal.functions.a.g).g(new io.reactivex.rxjava3.functions.a() { // from class: xsna.xos0
                        @Override // io.reactivex.rxjava3.functions.a
                        public final void run() {
                            if (((Boolean) x1e0.this.invoke()).booleanValue()) {
                                yns0 yns0Var2 = yns0Var;
                                yos0Var.c.a(context, new VideoGrowthTrapArguments(new TrapContentParams(yns0Var2.d, yns0Var2.e, yns0Var2.b), new VideoGrowthStoreParams(yns0Var2.f, yns0Var2.c), videoGrowthVideoParams));
                            }
                        }
                    }).subscribe();
                    break;
                } else {
                    break;
                }
        }
        return s3q0.a;
    }
}
