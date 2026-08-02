package defpackage;

import android.widget.Toast;
import java.util.ArrayList;

/* loaded from: classes15.dex */
public final /* synthetic */ class p3f0 implements Runnable {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ q3f0 b;

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2;
        int i = this.a;
        q3f0 q3f0Var = this.b;
        switch (i) {
            case 0:
                zq60 zq60Var = q3f0Var.c;
                zq60Var.getClass();
                zq60Var.b++;
                ArrayList arrayList = zq60Var.a;
                int size = arrayList.size();
                int i2 = 0;
                boolean z3 = false;
                while (true) {
                    int i3 = i2;
                    while (i3 < size && arrayList.get(i3) == null) {
                        i3++;
                    }
                    if (i3 < size) {
                        z = true;
                    } else {
                        if (!z3) {
                            zq60.a(zq60Var);
                            z3 = true;
                        }
                        z = false;
                    }
                    if (!z) {
                        break;
                    } else {
                        while (i2 < size && arrayList.get(i2) == null) {
                            i2++;
                        }
                        if (i2 >= size) {
                            if (!z3) {
                                zq60.a(zq60Var);
                            }
                            ny61.p();
                            break;
                        } else {
                            Toast.makeText(((ebz0) arrayList.get(i2)).a.c.a, oyh0.group_chat_privacy_restriction, 1).show();
                            i2++;
                        }
                    }
                }
            default:
                zq60 zq60Var2 = q3f0Var.c;
                zq60Var2.getClass();
                zq60Var2.b++;
                ArrayList arrayList2 = zq60Var2.a;
                int size2 = arrayList2.size();
                int i4 = 0;
                boolean z4 = false;
                while (true) {
                    int i5 = i4;
                    while (i5 < size2 && arrayList2.get(i5) == null) {
                        i5++;
                    }
                    if (i5 < size2) {
                        z2 = true;
                    } else {
                        if (!z4) {
                            zq60.a(zq60Var2);
                            z4 = true;
                        }
                        z2 = false;
                    }
                    if (!z2) {
                        break;
                    } else {
                        while (i4 < size2 && arrayList2.get(i4) == null) {
                            i4++;
                        }
                        if (i4 >= size2) {
                            if (!z4) {
                                zq60.a(zq60Var2);
                            }
                            ny61.p();
                            break;
                        } else {
                            Toast.makeText(((ebz0) arrayList2.get(i4)).a.c.a, oyh0.send_message_disabled_by_user_error, 1).show();
                            i4++;
                        }
                    }
                }
        }
    }
}
