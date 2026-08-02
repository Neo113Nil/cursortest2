package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.security.NoSuchAlgorithmException;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public interface b extends ru.mail.libverify.g0.f {
    @NonNull
    String a(@NonNull ru.mail.libverify.requests.c cVar) throws UnsupportedEncodingException, NoSuchAlgorithmException, IllegalArgumentException, MalformedURLException, JsonParseException;
}
