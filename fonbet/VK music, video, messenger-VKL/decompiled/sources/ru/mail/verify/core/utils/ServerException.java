package ru.mail.verify.core.utils;

import xsna.lhg;

/* loaded from: classes9.dex */
public class ServerException extends Exception {
    private final int a;

    public ServerException(int i) {
        super(lhg.a(i, "response code is "));
        this.a = i;
    }

    public final int a() {
        return this.a;
    }
}
