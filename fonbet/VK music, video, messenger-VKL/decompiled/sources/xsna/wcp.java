package xsna;

import android.content.SharedPreferences;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: EmojiAdapter.java */
/* loaded from: classes18.dex */
public final class wcp implements sdp {
    public final /* synthetic */ mep b;
    public final /* synthetic */ int c;
    public final /* synthetic */ com.vk.emoji.a d;

    public wcp(com.vk.emoji.a aVar, mep mepVar, int i) {
        this.d = aVar;
        this.b = mepVar;
        this.c = i;
    }

    @Override // xsna.sdp
    public final void b(String str) {
        com.vk.emoji.a aVar = this.d;
        aVar.x0();
        iep iepVar = aVar.f;
        mep mepVar = this.b;
        String str2 = mepVar.a;
        String str3 = mepVar.a;
        String str4 = (String) ((HashMap) iepVar.b.getValue()).get(str2);
        if (str4 != null) {
            str2 = str4;
        }
        if (!str2.equals(str)) {
            int i = this.c;
            aVar.notifyItemChanged(i);
            ((HashMap) iepVar.b.getValue()).put(str3, str);
            ((SharedPreferences) iepVar.a.getValue()).edit().putString("emoji_user_picked_variants", new JSONObject((HashMap) iepVar.b.getValue()).toString()).apply();
            boolean z = i < aVar.z0();
            int z0 = z ? 0 : aVar.z0();
            int z02 = z ? aVar.z0() : aVar.getItemCount();
            while (true) {
                if (z0 < z02) {
                    mep y0 = aVar.y0(z0);
                    if (y0 != null && y0.a.equals(str3)) {
                        aVar.notifyItemChanged(z0);
                        break;
                    }
                    z0++;
                } else {
                    break;
                }
            }
        }
        aVar.g.b(str);
    }
}
