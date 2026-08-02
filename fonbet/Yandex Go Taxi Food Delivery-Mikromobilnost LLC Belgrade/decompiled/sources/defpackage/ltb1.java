package defpackage;

import android.content.res.Resources;
import android.graphics.Point;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.credentials.exceptions.NoCredentialException;
import androidx.credentials.internal.FrameworkClassParsingException;
import kotlin.sequences.b;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public abstract class ltb1 {
    public static mtb1 a(Bundle bundle, String str) {
        try {
            switch (str.hashCode()) {
                case -1678407252:
                    if (str.equals("androidx.credentials.TYPE_DIGITAL_CREDENTIAL")) {
                        try {
                            String string = bundle.getString("androidx.credentials.BUNDLE_KEY_REQUEST_JSON");
                            djf djfVar = new djf();
                            if (string.length() != 0) {
                                try {
                                    new JSONObject(string);
                                    return djfVar;
                                } catch (Exception unused) {
                                }
                            }
                            throw new IllegalArgumentException("credentialJson must not be empty, and must be a valid JSON");
                        } catch (Exception unused2) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -1072734346:
                    if (str.equals("androidx.credentials.TYPE_RESTORE_CREDENTIAL")) {
                        String string2 = bundle.getString("androidx.credentials.BUNDLE_KEY_GET_RESTORE_CREDENTIAL_RESPONSE");
                        if (string2 == null) {
                            throw new NoCredentialException("The device does not contain a restore credential.");
                        }
                        djf djfVar2 = new djf();
                        if (string2.length() != 0) {
                            try {
                                new JSONObject(string2);
                                return djfVar2;
                            } catch (Exception unused3) {
                            }
                        }
                        throw new IllegalArgumentException("authenticationResponseJson must not be empty, and must be a valid JSON");
                    }
                    throw new FrameworkClassParsingException();
                case -543568185:
                    if (str.equals("android.credentials.TYPE_PASSWORD_CREDENTIAL")) {
                        try {
                            return new up90(bundle.getString("androidx.credentials.BUNDLE_KEY_ID"), bundle.getString("androidx.credentials.BUNDLE_KEY_PASSWORD"));
                        } catch (Exception unused4) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                case -95037569:
                    if (str.equals("androidx.credentials.TYPE_PUBLIC_KEY_CREDENTIAL")) {
                        try {
                            return new gyf0(bundle.getString("androidx.credentials.BUNDLE_KEY_AUTHENTICATION_RESPONSE_JSON"));
                        } catch (Exception unused5) {
                            throw new FrameworkClassParsingException();
                        }
                    }
                    throw new FrameworkClassParsingException();
                default:
                    throw new FrameworkClassParsingException();
            }
        } catch (FrameworkClassParsingException unused6) {
            return new djf(str);
        }
    }

    public static View b(View view, String str) {
        if (jl40.l(view.getTransitionName(), str)) {
            return view;
        }
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup != null) {
            return (View) b.j(b.o(new jr31(viewGroup, 0), new il01(str, 4)));
        }
        return null;
    }

    public static float c(float f, float f2, float f3) {
        return g8e.b(f3, f2, f, f2);
    }

    public static Point d(View view) {
        int[] iArr = new int[2];
        view.getLocationOnScreen(iArr);
        return new Point(iArr[0], iArr[1]);
    }

    public static View e(View view) {
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            return e(view2);
        }
        Object parent2 = view.getParent();
        View view3 = parent2 instanceof View ? (View) parent2 : null;
        return view3 == null ? view : view3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e3, code lost:
    
        if (r8 == null) goto L65;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static fh60 f(Resources resources, JSONObject jSONObject) {
        String str;
        String str2;
        JSONObject f;
        JSONObject f2;
        String string;
        JSONObject f3;
        String g = hbb1.g("Chat", jSONObject);
        String str3 = "Message";
        JSONObject f4 = hbb1.f("Message", jSONObject);
        JSONObject f5 = f4 != null ? hbb1.f("ServerMessageInfo", f4) : null;
        if (f5 == null || (f3 = hbb1.f("From", f5)) == null) {
            str = null;
        } else {
            str = hbb1.g("DisplayName", f3);
            if (str == null) {
                str = hbb1.g("Nickname", f3);
            }
        }
        Long valueOf = (f5 == null || !f5.has("Timestamp")) ? null : Long.valueOf(f5.getLong("Timestamp"));
        JSONObject f6 = hbb1.f("Message", jSONObject);
        if (f6 == null || (f = hbb1.f("ClientMessage", f6)) == null || (f2 = hbb1.f("Plain", f)) == null) {
            str2 = null;
        } else {
            JSONObject f7 = hbb1.f("Text", f2);
            if (f7 == null || (string = hbb1.g("MessageText", f7)) == null) {
                string = hbb1.f("Image", f2) != null ? resources.getString(qyh0.messenger_message_with_image) : null;
                if (string == null) {
                    string = hbb1.f("Gallery", f2) != null ? resources.getString(qyh0.messenger_message_with_gallery) : null;
                    if (string == null) {
                        string = hbb1.f("Sticker", f2) != null ? resources.getString(qyh0.messenger_message_with_sticker) : null;
                        if (string == null) {
                            string = hbb1.f("MiscFile", f2) != null ? resources.getString(qyh0.messenger_message_with_file) : null;
                            if (string == null) {
                                String string2 = hbb1.f("Voice", f2) != null ? resources.getString(qyh0.voice_message_placeholder_text) : null;
                                if (string2 == null) {
                                    JSONObject f8 = hbb1.f("Poll", f2);
                                    if (f8 != null) {
                                        String g2 = hbb1.g("title", f8);
                                        if (g2 == null) {
                                            g2 = "";
                                        }
                                        string2 = "📊 ".concat(g2);
                                    } else {
                                        string2 = null;
                                    }
                                }
                                str3 = string2;
                                str2 = str3;
                            }
                        }
                    }
                }
            }
            str3 = string;
            str2 = str3;
        }
        if (g == null || str == null || valueOf == null || str2 == null) {
            return null;
        }
        return new fh60(g, str, str2, valueOf.longValue());
    }
}
