package defpackage;

import androidx.fragment.app.FragmentActivity;
import defpackage.ynh;
import java.util.regex.Pattern;
import kotlin.a;

/* loaded from: classes11.dex */
public final class mo41 implements oey {
    public static final Pattern A = Pattern.compile("filename\\*\\s*=\\s*(?<encoding>.*)'.*'(?<encodedFilename>.*)\\s*", 2);
    public final FragmentActivity a;
    public final tya0 b;
    public final bj51 c;
    public final j0g w;
    public final ays0 x;
    public final jvx0 y;
    public final i3y z = a.a(new ec31(15, this));

    public mo41(FragmentActivity fragmentActivity, tya0 tya0Var, ynh.a aVar, j0g j0gVar, ays0 ays0Var, jvx0 jvx0Var, yp41 yp41Var) {
        this.a = fragmentActivity;
        this.b = tya0Var;
        this.c = aVar;
        this.w = j0gVar;
        this.x = ays0Var;
        this.y = jvx0Var;
    }
}
