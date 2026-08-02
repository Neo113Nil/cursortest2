package ru.mail.verify.core.utils;

import androidx.annotation.NonNull;
import java.io.IOException;
import ru.mail.verify.core.utils.b;

/* loaded from: classes9.dex */
public interface a {
    @NonNull
    a a();

    @NonNull
    a a(int i) throws IOException, ClientException;

    @NonNull
    a a(@NonNull String str) throws IOException, ClientException;

    @NonNull
    a a(@NonNull String str, @NonNull String str2) throws IOException, ClientException;

    @NonNull
    a a(@NonNull b.a aVar) throws IOException, ClientException;

    @NonNull
    a a(boolean z) throws IOException, ClientException;

    @NonNull
    a b(int i) throws IOException, ClientException;

    @NonNull
    c b() throws IOException, ClientException;

    @NonNull
    a c() throws IOException, ClientException;
}
