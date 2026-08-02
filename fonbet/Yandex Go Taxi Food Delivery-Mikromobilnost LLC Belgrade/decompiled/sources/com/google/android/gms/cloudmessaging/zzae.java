package com.google.android.gms.cloudmessaging;

import android.content.Intent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.cloudmessaging.zzf;
import defpackage.dc91;
import defpackage.ycs0;
import java.util.Objects;
import java.util.regex.Matcher;

/* loaded from: classes.dex */
final class zzae extends zzf {
    final /* synthetic */ a zza;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzae(a aVar, Looper looper) {
        super(looper);
        this.zza = aVar;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        a aVar = this.zza;
        int i = a.h;
        if (message != null) {
            Object obj = message.obj;
            if (obj instanceof Intent) {
                Intent intent = (Intent) obj;
                intent.setExtrasClassLoader(new dc91());
                if (intent.hasExtra("google.messenger")) {
                    Parcelable parcelableExtra = intent.getParcelableExtra("google.messenger");
                    if (parcelableExtra instanceof zzd) {
                        aVar.g = (zzd) parcelableExtra;
                    }
                    if (parcelableExtra instanceof Messenger) {
                        aVar.f = (Messenger) parcelableExtra;
                    }
                }
                Intent intent2 = (Intent) message.obj;
                if (!Objects.equals(intent2.getAction(), "com.google.android.c2dm.intent.REGISTRATION")) {
                    Log.isLoggable("Rpc", 3);
                    return;
                }
                String stringExtra = intent2.getStringExtra("registration_id");
                if (stringExtra == null) {
                    stringExtra = intent2.getStringExtra("unregistered");
                }
                if (stringExtra != null) {
                    Matcher matcher = a.j.matcher(stringExtra);
                    if (!matcher.matches()) {
                        Log.isLoggable("Rpc", 3);
                        return;
                    }
                    String group = matcher.group(1);
                    String group2 = matcher.group(2);
                    if (group != null) {
                        Bundle extras = intent2.getExtras();
                        extras.putString("registration_id", group2);
                        aVar.b(extras, group);
                        return;
                    }
                    return;
                }
                String stringExtra2 = intent2.getStringExtra("error");
                if (stringExtra2 == null) {
                    intent2.getExtras();
                    return;
                }
                Log.isLoggable("Rpc", 3);
                if (stringExtra2.startsWith("|")) {
                    String[] split = stringExtra2.split("\\|");
                    if (split.length <= 2 || !Objects.equals(split[1], "ID")) {
                        return;
                    }
                    String str = split[2];
                    String str2 = split[3];
                    if (str2.startsWith(":")) {
                        str2 = str2.substring(1);
                    }
                    aVar.b(intent2.putExtra("error", str2).getExtras(), str);
                    return;
                }
                synchronized (aVar.a) {
                    int i2 = 0;
                    while (true) {
                        try {
                            ycs0 ycs0Var = aVar.a;
                            if (i2 < ycs0Var.c) {
                                aVar.b(intent2.getExtras(), (String) ycs0Var.f(i2));
                                i2++;
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                }
            }
        }
    }
}
