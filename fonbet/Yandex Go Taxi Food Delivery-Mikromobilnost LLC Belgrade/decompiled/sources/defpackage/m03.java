package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Process;
import com.jakewharton.processphoenix.ProcessPhoenix;
import java.util.Arrays;
import ru.CryptoPro.JCP.tools.SelfTester_JCP;
import ru.yandex.taxi.activity.AndroidComponentRepository$Component;

/* loaded from: classes12.dex */
public final class m03 {
    public final y72 a;

    public m03(y72 y72Var) {
        this.a = y72Var;
    }

    public final void a(Context context) {
        Intent intent = new Intent(context, (Class<?>) this.a.a(AndroidComponentRepository$Component.MAIN_ACTIVITY));
        i891.f(context);
        Intent[] intentArr = {intent};
        intentArr[0].addFlags(268468224);
        Intent intent2 = new Intent(context, (Class<?>) ProcessPhoenix.class);
        intent2.addFlags(SelfTester_JCP.IMITA);
        intent2.putParcelableArrayListExtra("phoenix_restart_intents", scc.c(Arrays.copyOf(intentArr, 1)));
        intent2.putExtra("phoenix_main_process_pid", Process.myPid());
        Bundle bundle = new Bundle();
        bundle.putInt("android.activity.splashScreenStyle", 1);
        context.startActivity(intent2, bundle);
    }
}
