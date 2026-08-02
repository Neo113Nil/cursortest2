package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import java.io.File;
import kotlin.text.Regex;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ux9 implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ String c;

    public /* synthetic */ ux9(String str, int i) {
        this.b = i;
        this.c = str;
    }

    @Override // xsna.izs
    public final Object invoke(Object obj) {
        PrivateFiles.a b;
        int i = this.b;
        String str = this.c;
        switch (i) {
            case 0:
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.n(tgi0Var, 0);
                qgi0.h(tgi0Var, str);
                break;
            case 1:
                qgi0.h((tgi0) obj, str);
                break;
            case 2:
                b = e8r.a.b(r1, PrivateSubdir.MUSIC_STICKER.h(), true);
                File file = new File(b.a, str);
                Regex regex = com.vk.core.files.a.a;
                vhk0.d(file);
                break;
            case 3:
                tgi0 tgi0Var2 = (tgi0) obj;
                qgi0.j(tgi0Var2, 0);
                qgi0.h(tgi0Var2, str);
                break;
            case 4:
                tgi0 tgi0Var3 = (tgi0) obj;
                qgi0.k(tgi0Var3, str);
                qgi0.v(tgi0Var3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                break;
            case 5:
                e0w e0wVar = (e0w) obj;
                e0wVar.execSQL("DELETE FROM messages_search WHERE docid IN(" + str + ')');
                e0wVar.execSQL("DELETE FROM message_attaches WHERE msg_local_id IN(" + str + ')');
                e0wVar.execSQL("DELETE FROM messages WHERE local_id IN(" + str + ')');
                break;
            default:
                tgi0 tgi0Var4 = (tgi0) obj;
                if (str != null) {
                    qgi0.e(tgi0Var4, str, new c24(0));
                }
                break;
        }
        return s3q0.a;
    }
}
