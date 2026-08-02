package xsna;

import android.content.Context;
import com.vk.core.preference.Preference;
import com.vk.core.util.parallelrunner.ParallelTaskRunner;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import io.jsonwebtoken.JwtParser;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.io.FileAlreadyExistsException;
import kotlin.io.NoSuchFileException;

/* compiled from: MultiAccountPrefsInitTaskLogic.kt */
/* loaded from: classes11.dex */
public final class q240 extends ParallelTaskRunner.a {
    @Override // com.vk.core.util.parallelrunner.ParallelTaskRunner.d
    public final String a() {
        return "MultiAccountPrefInit";
    }

    @Override // xsna.gzs
    public final s3q0 invoke() {
        Preference.a.getClass();
        Preference.e = true;
        Preference.f = String.valueOf(o25.a().c().b);
        ((SessionManagementComponent) c().a(fpf0.a(SessionManagementComponent.class))).J2().f(new p240());
        Preference.g = new xv8(4);
        if (!Preference.k && Preference.x() && !Preference.j().getBoolean("multi_account_migration_completed", false)) {
            System.currentTimeMillis();
            File q = Preference.q();
            File[] listFiles = q.listFiles();
            if (listFiles != null) {
                for (File file : listFiles) {
                    String n = nbr.n(file);
                    String m = nbr.m(file);
                    file.getName();
                    if (file.isFile()) {
                        Preference.a.getClass();
                        Context context = Preference.b;
                        if (context == null) {
                            context = null;
                        }
                        if (!drm0.D(n, context.getApplicationInfo().packageName, false) && !Preference.g.invoke(n).booleanValue()) {
                            StringBuilder b = v1v.b(n, '-');
                            b.append(Preference.f);
                            b.append(JwtParser.SEPARATOR_CHAR);
                            b.append(m);
                            String sb = b.toString();
                            file.getName();
                            try {
                                nbr.k(file, new File(q, sb), false, 4);
                            } catch (FileNotFoundException | FileAlreadyExistsException | NoSuchFileException unused) {
                            }
                        }
                    }
                }
            }
            System.currentTimeMillis();
            qaj0.c(Preference.j(), "multi_account_migration_completed", Boolean.TRUE);
        }
        return s3q0.a;
    }
}
