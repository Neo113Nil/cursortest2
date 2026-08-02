package xsna;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Xml;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.vk.auth.main.SilentAuthSource;
import com.vk.emailforwarding.api.VkEmailForwardingConfig;
import com.vk.mail.auth.api.MailAuthFlowConfig;
import io.opentelemetry.api.common.AttributeType;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;
import kotlin.Pair;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: AppLocalesStorageHelper.java */
/* loaded from: classes.dex */
public final class m63 {
    public static final Object a = new Object();
    public static qb60 b;
    public static nxv c;
    public static oxv d;
    public static pxv e;

    public static final void a(ohk0 ohk0Var, String str, Pair... pairArr) {
        if (ohk0Var != null) {
            ohk0Var.j(str, n(pairArr));
        }
    }

    public static final void b(ohk0 ohk0Var, String str, Pair... pairArr) {
        if (ohk0Var != null) {
            ohk0Var.setAttribute("error.type", str);
        }
        if (ohk0Var != null) {
            j(ohk0Var, (Pair[]) Arrays.copyOf(pairArr, pairArr.length));
        }
    }

    public static final ohk0 c() {
        ohk0 current = ohk0.current();
        if (((sm5) current.i()).f && current.i().i()) {
            return current;
        }
        return null;
    }

    public static final VkEmailForwardingConfig d(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("forwarding_email", VkEmailForwardingConfig.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("forwarding_email");
            if (!(parcelable3 instanceof VkEmailForwardingConfig)) {
                parcelable3 = null;
            }
            parcelable = (VkEmailForwardingConfig) parcelable3;
        }
        return (VkEmailForwardingConfig) parcelable;
    }

    public static final MailAuthFlowConfig e(Bundle bundle) {
        Parcelable parcelable;
        Object parcelable2;
        if (Build.VERSION.SDK_INT >= 33) {
            parcelable2 = bundle.getParcelable("mail_flow", MailAuthFlowConfig.class);
            parcelable = (Parcelable) parcelable2;
        } else {
            Parcelable parcelable3 = bundle.getParcelable("mail_flow");
            if (!(parcelable3 instanceof MailAuthFlowConfig)) {
                parcelable3 = null;
            }
            parcelable = (MailAuthFlowConfig) parcelable3;
        }
        return (MailAuthFlowConfig) parcelable;
    }

    public static final SilentAuthSource f(Bundle bundle) {
        return (SilentAuthSource) j5g.b0(bundle.getInt("mail_flow_silent_auth_source", -1), SilentAuthSource.h());
    }

    public static final boolean g(Bundle bundle) {
        return bundle.getString("white_label_flow_input_sat") != null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
    
        if (r5 != null) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void h(Context context, String str) {
        synchronized (a) {
            if (str.equals("")) {
                context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                return;
            }
            try {
                FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
                XmlSerializer newSerializer = Xml.newSerializer();
                try {
                    newSerializer.setOutput(openFileOutput, null);
                    newSerializer.startDocument(C.UTF8_NAME, Boolean.TRUE);
                    newSerializer.startTag(null, "locales");
                    newSerializer.attribute(null, "application_locales", str);
                    newSerializer.endTag(null, "locales");
                    newSerializer.endDocument();
                } catch (Exception unused) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused2) {
                        }
                    }
                } catch (Throwable th) {
                    if (openFileOutput != null) {
                        try {
                            openFileOutput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0044, code lost:
    
        if (r2 != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x002e, code lost:
    
        if (r5 != 4) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x003b, code lost:
    
        if (r3.getName().equals("locales") == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003d, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String i(Context context) {
        String str;
        synchronized (a) {
            str = "";
            try {
                FileInputStream openFileInput = context.openFileInput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                try {
                    XmlPullParser newPullParser = Xml.newPullParser();
                    newPullParser.setInput(openFileInput, C.UTF8_NAME);
                    int depth = newPullParser.getDepth();
                    while (true) {
                        int next = newPullParser.next();
                        if (next != 1) {
                            if (next == 3 && newPullParser.getDepth() <= depth) {
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                } catch (IOException | XmlPullParserException unused) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused2) {
                        }
                    }
                    if (str.isEmpty()) {
                        context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
                    }
                    return str;
                } catch (Throwable th) {
                    if (openFileInput != null) {
                        try {
                            openFileInput.close();
                        } catch (IOException unused3) {
                        }
                    }
                    throw th;
                }
            } catch (FileNotFoundException unused4) {
                return "";
            }
        }
        return str;
    }

    public static final void j(ohk0 ohk0Var, Pair... pairArr) {
        if (ohk0Var != null) {
            ohk0Var.d(n(pairArr));
        }
    }

    public static final void k(Throwable th, Throwable th2) {
        Throwable th3;
        Throwable th4 = th;
        while (true) {
            th3 = null;
            if (th.getCause() == null || th.getCause() == th4) {
                break;
            } else {
                th4 = th4 != null ? th4.getCause() : null;
            }
        }
        if (th4 != null) {
            try {
                th3 = th4.getCause();
            } catch (IllegalStateException unused) {
                return;
            }
        }
        if (th3 != null || th2 == null || th4 == null) {
            return;
        }
        th4.initCause(th2);
    }

    public static final void l(Bundle bundle, Bundle bundle2) {
        bundle.putBundle("payload", bundle2);
    }

    public static final void m(Bundle bundle, String str) {
        bundle.putString("white_label_flow_output_sat", str);
    }

    public static final jk3 n(Pair[] pairArr) {
        lk3 lk3Var = new lk3();
        for (Pair pair : pairArr) {
            String str = (String) pair.d();
            Object g = pair.g();
            if (g == null) {
                s3q0 s3q0Var = s3q0.a;
            } else if (g instanceof String) {
                lk3Var.b(str, (String) g);
            } else if (g instanceof Long) {
                lk3Var.a(((Number) g).longValue(), str);
            } else if (g instanceof Integer) {
                lk3Var.a(((Number) g).intValue(), str);
            } else if (g instanceof Double) {
                lk3Var.c(((Number) g).doubleValue(), str);
            } else if (g instanceof Float) {
                lk3Var.c(((Number) g).floatValue(), str);
            } else if (g instanceof Boolean) {
                lk3Var.f(xfx.a(AttributeType.BOOLEAN, str), (Boolean) g);
            } else {
                lk3Var.b(str, g.toString());
            }
        }
        return lk3Var.e();
    }
}
