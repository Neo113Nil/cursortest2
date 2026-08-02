package ru.mail.libverify.j0;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.net.MalformedURLException;
import ru.mail.verify.core.utils.json.JsonParseException;

/* loaded from: classes9.dex */
public interface e {
    @Nullable
    a a(@NonNull ru.mail.libverify.requests.c cVar) throws JsonParseException;

    @Nullable
    ru.mail.libverify.requests.c a(@NonNull a aVar) throws MalformedURLException, JsonParseException;
}
