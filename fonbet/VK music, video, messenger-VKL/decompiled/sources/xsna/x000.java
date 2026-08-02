package xsna;

import android.content.SharedPreferences;
import com.vk.utils.log.LogUploader;
import java.io.File;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x000 implements io.reactivex.rxjava3.functions.a {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ x000(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // io.reactivex.rxjava3.functions.a
    public final void run() {
        SharedPreferences sharedPreferences;
        String str;
        switch (this.b) {
            case 0:
                LogUploader.LogArtifact logArtifact = (LogUploader.LogArtifact) this.c;
                File file = (File) this.d;
                LogUploader.b bVar = LogUploader.b;
                int i = LogUploader.c.$EnumSwitchMapping$0[logArtifact.ordinal()];
                if (i == 1) {
                    sharedPreferences = bVar.a;
                    str = "log_collector_is_app_sent_key";
                } else {
                    if (i != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    sharedPreferences = bVar.a;
                    str = "log_collector_is_net_sent_key";
                }
                tdj.b(sharedPreferences, str, true);
                file.delete();
                return;
            default:
                d6f0 d6f0Var = (d6f0) this.c;
                d6f0Var.b.remove((String) this.d);
                return;
        }
    }
}
