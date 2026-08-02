package xsna;

import android.widget.TextView;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.unity3d.services.UnityAdsConstants;
import com.vk.newsfeed.posting.impl.presentation.model.MusicDto;
import java.util.ArrayList;
import kotlin.jvm.internal.Ref$IntRef;

/* compiled from: ViewExt.kt */
/* loaded from: classes2.dex */
public final class fyb implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ fyb(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                com.vk.im.ui.components.chat_profile.a aVar = (com.vk.im.ui.components.chat_profile.a) this.f;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.e;
                TextView textView = (TextView) this.c;
                int measuredWidth = textView.getMeasuredWidth();
                int measuredHeight = textView.getMeasuredHeight();
                Ref$IntRef ref$IntRef2 = (Ref$IntRef) this.d;
                if (ref$IntRef2.element != measuredWidth || ref$IntRef.element != measuredHeight) {
                    ref$IntRef2.element = measuredWidth;
                    ref$IntRef.element = measuredHeight;
                    TextView textView2 = aVar.y;
                    if (textView2 == null) {
                        textView2 = null;
                    }
                    textView2.setPivotX(measuredWidth / 2.0f);
                    TextView textView3 = aVar.y;
                    (textView3 != null ? textView3 : null).setPivotY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                }
                break;
            default:
                SnapshotStateList snapshotStateList = (SnapshotStateList) this.c;
                snapshotStateList.remove((MusicDto) this.d);
                ((izs) this.e).invoke(new ArrayList(snapshotStateList));
                if (snapshotStateList.isEmpty()) {
                    ((gzs) this.f).invoke();
                }
                break;
        }
        return s3q0.a;
    }
}
