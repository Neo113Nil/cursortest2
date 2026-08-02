package com.yandex.messaging.core.net.entities.directives;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.JsonReader;
import com.squareup.moshi.JsonWriter;
import com.squareup.moshi.Moshi;
import defpackage.g8e;
import defpackage.ny61;
import defpackage.tmj;
import defpackage.yci0;
import defpackage.ydz;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public class DirectiveAdapter extends JsonAdapter<Directive> {
    public static final tmj b = new tmj(0);
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public final Moshi a;

    static {
        a(OpenBotDirective.class, "open_bot");
        a(OpenDialogDirective.class, "open_dialog");
        a(OpenUriDirective.class, "open_uri");
        a(TypeDirective.class, "type");
        a(CallPhoneDirective.class, "call_phone");
        a(OpenPaymentDirective.class, "open_payment");
        a(SendMessageDirective.class, "send_message");
        a(OpenIFrameDirective.class, "open_iframe");
        a(SetElementsStateDirective.class, "set_elements_state");
    }

    public DirectiveAdapter(Moshi moshi) {
        this.a = moshi;
    }

    public static void a(Class cls, String str) {
        c.put(str, cls);
        d.put(cls, str);
    }

    public final Directive b(String str, String str2, Object obj) {
        str.getClass();
        boolean equals = str.equals("client_action");
        Moshi moshi = this.a;
        if (equals) {
            if ("send_bot_request".equals(str2)) {
                SendBotRequestDirective sendBotRequestDirective = new SendBotRequestDirective();
                sendBotRequestDirective.b = obj;
                return sendBotRequestDirective;
            }
            Class cls = (Class) c.get(str2);
            if (cls != null) {
                return (Directive) moshi.adapter(cls).fromJsonValue(obj);
            }
            ny61.g(g8e.o("Unknown client_action: ", str2));
            return null;
        }
        if (!str.equals("server_action")) {
            ny61.g("Unknown directive type: ".concat(str));
            return null;
        }
        if (obj instanceof Map) {
            return new ServerDirective(str2, moshi.adapter(Map.class).toJson((Map) obj));
        }
        if ((obj instanceof String) || obj == null) {
            return new ServerDirective(str2, (String) obj);
        }
        StringBuilder sb = new StringBuilder("Impossible to parse ServerDirective payload: ");
        sb.append(obj);
        yci0.q(sb, Extension.O_BRAKE_SPACE, obj.getClass(), Extension.C_BRAKE);
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final Directive fromJson(JsonReader jsonReader) {
        DirectiveRaw directiveRaw = (DirectiveRaw) this.a.adapter(DirectiveRaw.class).fromJson(jsonReader);
        if (directiveRaw == null) {
            ydz.b("DirectiveAdapter", "Could not read directive");
            return null;
        }
        try {
            return b(directiveRaw.type, directiveRaw.name, directiveRaw.payload);
        } catch (IllegalArgumentException | IllegalStateException | NullPointerException e) {
            ydz.c("DirectiveAdapter", "Creation directive fail", e);
            return null;
        }
    }

    @Override // com.squareup.moshi.JsonAdapter
    public final void toJson(JsonWriter jsonWriter, Directive directive) {
        Directive directive2 = directive;
        if (directive2 == null) {
            jsonWriter.nullValue();
            return;
        }
        DirectiveRaw directiveRaw = new DirectiveRaw();
        boolean z = directive2 instanceof ServerDirective;
        Moshi moshi = this.a;
        if (z) {
            ServerDirective serverDirective = (ServerDirective) directive2;
            directiveRaw.type = "server_action";
            directiveRaw.name = serverDirective.a;
            directiveRaw.payload = serverDirective.b;
        } else if (directive2 instanceof SendBotRequestDirective) {
            directiveRaw.type = "client_action";
            directiveRaw.name = "send_bot_request";
            directiveRaw.payload = ((SendBotRequestDirective) directive2).b;
        } else {
            Class<?> cls = directive2.getClass();
            String str = (String) d.get(cls);
            if (str == null) {
                ydz.b("DirectiveAdapter", "Unknown directive class: " + cls);
                return;
            } else {
                directiveRaw.type = "client_action";
                directiveRaw.name = str;
                directiveRaw.payload = moshi.adapter((Type) cls).toJsonValue(directive2);
            }
        }
        moshi.adapter(DirectiveRaw.class).toJson(jsonWriter, (JsonWriter) directiveRaw);
    }
}
