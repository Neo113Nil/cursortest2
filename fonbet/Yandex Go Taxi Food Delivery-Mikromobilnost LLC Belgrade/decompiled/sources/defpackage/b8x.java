package defpackage;

import java.security.AlgorithmParameters;
import java.security.KeyFactory;
import java.security.MessageDigest;
import java.security.Signature;

/* loaded from: classes4.dex */
public interface b8x {
    AlgorithmParameters b(String str);

    MessageDigest c(String str);

    KeyFactory e();

    Signature g(String str);
}
