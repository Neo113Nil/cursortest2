package xsna;

import android.content.Context;
import com.vk.clips.edit.privacy.PrivacyViewer;
import com.vk.dto.common.data.PrivacySetting;
import com.vk.dto.posting.PostingVisibilityMode;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* compiled from: ClipsPrivacyInteractorImpl.kt */
/* loaded from: classes17.dex */
public final class xwe implements uwe {
    public final qwe a;
    public final Context b;

    public xwe(qwe qweVar, Context context) {
        this.a = qweVar;
        this.b = context;
    }

    @Override // xsna.uwe
    public final PostingVisibilityMode a() {
        return this.a.a();
    }

    @Override // xsna.uwe
    public final List<PrivacySetting.PrivacyRule> b(PostingVisibilityMode postingVisibilityMode) {
        return this.a.b(postingVisibilityMode);
    }

    @Override // xsna.uwe
    public final List<PrivacySetting.PrivacyRule> c(boolean z, boolean z2) {
        return this.a.c(z, z2);
    }

    @Override // xsna.uwe
    public final List<PrivacySetting.PrivacyRule> d(boolean z, boolean z2) {
        return this.a.c(z, z2);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // xsna.uwe
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(PrivacySetting privacySetting, List list, List list2, PrivacyViewer privacyViewer, ContinuationImpl continuationImpl) {
        vwe vweVar;
        int i;
        if (continuationImpl instanceof vwe) {
            vweVar = (vwe) continuationImpl;
            int i2 = vweVar.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vweVar.label = i2 - Integer.MIN_VALUE;
                Object obj = vweVar.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = vweVar.label;
                if (i == 0) {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                    return obj;
                }
                kotlin.a.a(obj);
                ovj b = hqu0.b();
                wwe wweVar = new wwe(this, privacySetting, list, list2, privacyViewer, null);
                vweVar.L$0 = null;
                vweVar.L$1 = null;
                vweVar.L$2 = null;
                vweVar.L$3 = null;
                vweVar.label = 1;
                Object k = myc0.k(b, wweVar, vweVar);
                return k == coroutineSingletons ? coroutineSingletons : k;
            }
        }
        vweVar = new vwe(this, continuationImpl);
        Object obj2 = vweVar.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = vweVar.label;
        if (i == 0) {
        }
    }

    @Override // xsna.uwe
    public final void f(PostingVisibilityMode postingVisibilityMode) {
        this.a.f(postingVisibilityMode);
    }
}
