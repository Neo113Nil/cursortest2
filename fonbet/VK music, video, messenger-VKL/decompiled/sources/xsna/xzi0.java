package xsna;

import android.content.Context;
import com.vkontakte.android.R;

/* compiled from: SettingRecyclerItem.kt */
/* loaded from: classes18.dex */
public final class xzi0 extends eg90 {
    public final int b;
    public final String c;
    public final Integer d;
    public final gzs<s3q0> e;

    public xzi0() {
        throw null;
    }

    public xzi0(Integer num, gzs gzsVar) {
        Context context = e43.a;
        String string = (context == null ? null : context).getString(R.string.subscription_music);
        this.b = R.drawable.vk_icon_music_outline_28;
        this.c = string;
        this.d = num;
        this.e = gzsVar;
    }

    @Override // xsna.zif0
    public final long a() {
        return this.b;
    }

    @Override // xsna.zif0
    public final int b() {
        return 0;
    }
}
