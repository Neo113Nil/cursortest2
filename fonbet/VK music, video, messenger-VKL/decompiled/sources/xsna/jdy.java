package xsna;

import java.math.BigInteger;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.NoSuchAlgorithmException;
import javax.crypto.KeyAgreement;
import javax.crypto.interfaces.DHPublicKey;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.DHPublicKeySpec;
import one.video.streaming.oktp.KeyExchange;

/* compiled from: KeyExchangeImpl.java */
/* loaded from: classes8.dex */
public final class jdy implements KeyExchange {
    public static final BigInteger d = new BigInteger("FFFFFFFFFFFFFFFFC90FDAA22168C234C4C6628B80DC1CD129024E088A67CC74020BBEA63B139B22514A08798E3404DDEF9519B3CD3A431B302B0A6DF25F14374FE1356D6D51C245E485B576625E7EC6F44C42E9A637ED6B0BFF5CB6F406B7EDEE386BFB5A899FA5AE9F24117C4B1FE649286651ECE45B3DC2007CB8A163BF0598DA48361C55D39A69163FA8FD24CF5F83655D23DCA3AD961C62F356208552BB9ED529077096966D670C354E4ABC9804F1746C08CA18217C32905E462E36CE3BE39E772C180E86039B2783A2EC07A28FB5C55DF06F4C52C9DE2BCBF6955817183995497CEA956AE515D2261898FA051015728E5A8AACAA68FFFFFFFFFFFFFFFF", 16);
    public static final BigInteger e = new BigInteger("2");
    public final KeyPair a;
    public byte[] b;
    public byte[] c;

    public jdy() {
        try {
            KeyPairGenerator keyPairGenerator = KeyPairGenerator.getInstance("DH");
            keyPairGenerator.initialize(new DHParameterSpec(d, e));
            this.a = keyPairGenerator.generateKeyPair();
        } catch (InvalidAlgorithmParameterException | NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    @Override // one.video.streaming.oktp.KeyExchange
    public final byte[] getPublicKey() {
        return ((DHPublicKey) this.a.getPublic()).getY().toByteArray();
    }

    @Override // one.video.streaming.oktp.KeyExchange
    public final byte[] getRemotePublicKey() {
        return this.c;
    }

    @Override // one.video.streaming.oktp.KeyExchange
    public final byte[] getSecretKey() {
        return this.b;
    }

    @Override // one.video.streaming.oktp.KeyExchange
    public final void setRemoteKey(byte[] bArr) {
        this.c = bArr;
        try {
            KeyAgreement keyAgreement = KeyAgreement.getInstance("DH");
            keyAgreement.init(this.a.getPrivate());
            keyAgreement.doPhase(KeyFactory.getInstance("DH").generatePublic(new DHPublicKeySpec(new BigInteger(1, bArr), d, e)), true);
            this.b = keyAgreement.generateSecret();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
