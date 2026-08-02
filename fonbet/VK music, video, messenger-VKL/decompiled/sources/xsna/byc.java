package xsna;

import android.widget.EditText;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class byc implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ byc(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                ((Integer) obj).intValue();
                int i2 = ClipFeedListFragment.a2;
                return Boolean.valueOf(epx.f(((FeedItem) obj2).F(), str));
            default:
                EditText editText = (EditText) obj;
                String[] strArr = DebugDevSettingsFragment.t0;
                editText.setInputType(1);
                editText.setHint("creativeType");
                editText.setText(str);
                return null;
        }
    }
}
