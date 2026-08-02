package xsna;

import com.google.crypto.tink.shaded.protobuf.ByteString;
import java.io.IOException;
import java.util.List;

/* compiled from: Reader.java */
/* loaded from: classes.dex */
public interface v7f0 {
    void A(List<String> list) throws IOException;

    void B(List<Float> list) throws IOException;

    void C(List<ByteString> list) throws IOException;

    void D(List<Double> list) throws IOException;

    long E() throws IOException;

    void F(List<Integer> list) throws IOException;

    void G() throws IOException;

    void H(List<Long> list) throws IOException;

    void I(List<Integer> list) throws IOException;

    void J(List<Integer> list) throws IOException;

    long K() throws IOException;

    int L() throws IOException;

    String M() throws IOException;

    int a() throws IOException;

    @Deprecated
    <T> T b(com.google.crypto.tink.shaded.protobuf.a0<T> a0Var, com.google.crypto.tink.shaded.protobuf.k kVar) throws IOException;

    int c() throws IOException;

    void d(List<Boolean> list) throws IOException;

    void e(List<Integer> list) throws IOException;

    void f(List<Long> list) throws IOException;

    void g(List<Integer> list) throws IOException;

    int getTag();

    <T> T h(com.google.crypto.tink.shaded.protobuf.a0<T> a0Var, com.google.crypto.tink.shaded.protobuf.k kVar) throws IOException;

    boolean i() throws IOException;

    long j() throws IOException;

    boolean k() throws IOException;

    void l(List<Long> list) throws IOException;

    void m(List<String> list) throws IOException;

    int n() throws IOException;

    void o(List<Long> list) throws IOException;

    int p() throws IOException;

    String q() throws IOException;

    @Deprecated
    <T> void r(List<T> list, com.google.crypto.tink.shaded.protobuf.a0<T> a0Var, com.google.crypto.tink.shaded.protobuf.k kVar) throws IOException;

    double readDouble() throws IOException;

    float readFloat() throws IOException;

    void s(List<Long> list) throws IOException;

    long t() throws IOException;

    int u() throws IOException;

    ByteString v() throws IOException;

    long w() throws IOException;

    <T> void x(List<T> list, com.google.crypto.tink.shaded.protobuf.a0<T> a0Var, com.google.crypto.tink.shaded.protobuf.k kVar) throws IOException;

    void y(List<Integer> list) throws IOException;

    int z() throws IOException;
}
