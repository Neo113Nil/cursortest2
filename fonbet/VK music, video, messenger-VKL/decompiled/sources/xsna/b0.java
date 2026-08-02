package xsna;

import android.app.Activity;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;
import com.ironsource.Aa;
import com.ironsource.adapters.yandex.rewarded.YandexRewardedAdapter;
import com.unity3d.mediation.LevelPlayAdError;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Objects;
import java.util.regex.Pattern;
import one.video.calls.sdk_private.aG;
import ru.ok.android.webrtc.Call;
import xsna.ikv0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes13.dex */
public final /* synthetic */ class b0 implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ b0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                Aa.a((LevelPlayAdError) obj2, (Aa) obj);
                break;
            case 1:
                TextView textView = (TextView) obj;
                Pattern pattern = ln0.h1;
                String obj3 = drm0.p0(((EditText) obj2).getText().toString()).toString();
                if (textView != null) {
                    textView.setEnabled(ln0.Yn(obj3));
                    break;
                }
                break;
            case 2:
                ((Call) obj2).a((Runnable) obj);
                break;
            case 3:
                int i2 = com.vk.profile.questions.impl.b.q1;
                ((ikv0.a) obj2).p((Window) obj);
                break;
            case 4:
                YandexRewardedAdapter.showAd$lambda$3((YandexRewardedAdapter) obj2, (Activity) obj);
                break;
            case 5:
                one.video.calls.sdk_private.x xVar = ((cny0) obj2).f;
                Object[] objArr = {new fhy0()};
                ArrayList arrayList = new ArrayList(1);
                Object obj4 = objArr[0];
                Objects.requireNonNull(obj4);
                arrayList.add(obj4);
                xVar.a(Collections.unmodifiableList(arrayList), ((aG) obj).h());
                break;
            case 6:
                ((yads.ho0) obj2).b((yads.cg2) obj);
                break;
            default:
                ((ru.mail.libverify.api.q) obj2).b((ru.mail.libverify.g.b) obj);
                break;
        }
    }

    public /* synthetic */ b0(EditText editText, TextView textView, ln0 ln0Var) {
        this.b = 1;
        this.c = editText;
        this.d = textView;
    }
}
