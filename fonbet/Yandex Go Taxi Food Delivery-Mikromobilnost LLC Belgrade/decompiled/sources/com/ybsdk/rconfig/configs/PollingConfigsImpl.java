package com.ybsdk.rconfig.configs;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import defpackage.jl40;
import defpackage.nnm;
import defpackage.tje;
import defpackage.y1e0;
import java.util.Map;
import kotlin.Metadata;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000#\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0003\b¼\u0001\b\u0081\b\u0018\u0000 Ë\u0001:\u0002Ì\u0001B\u001b\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0003¢\u0006\u0004\b\u0007\u0010\bJ&\u0010\t\u001a\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R#\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00018\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\bR\u001a\u0010\u0016\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u000eR\u001a\u0010\u0019\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u001a\u0010\u000eR\u001a\u0010\u001b\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u000eR\u001a\u0010\u001d\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0017\u001a\u0004\b\u001e\u0010\u000eR\u001a\u0010\u001f\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u001f\u0010\u0017\u001a\u0004\b \u0010\u000eR\u001a\u0010!\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b!\u0010\u0017\u001a\u0004\b\"\u0010\u000eR\u001a\u0010#\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b#\u0010\u0017\u001a\u0004\b$\u0010\u000eR\u001a\u0010%\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b%\u0010\u0017\u001a\u0004\b&\u0010\u000eR\u001a\u0010'\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b'\u0010\u0017\u001a\u0004\b(\u0010\u000eR\u001a\u0010)\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b)\u0010\u0017\u001a\u0004\b*\u0010\u000eR\u001a\u0010+\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b+\u0010\u0017\u001a\u0004\b,\u0010\u000eR\u001a\u0010-\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b-\u0010\u0017\u001a\u0004\b.\u0010\u000eR\u001a\u0010/\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b/\u0010\u0017\u001a\u0004\b0\u0010\u000eR\u001a\u00101\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b1\u0010\u0017\u001a\u0004\b2\u0010\u000eR\u001a\u00103\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b3\u0010\u0017\u001a\u0004\b4\u0010\u000eR\u001a\u00105\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b5\u0010\u0017\u001a\u0004\b6\u0010\u000eR\u001a\u00107\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b7\u0010\u0017\u001a\u0004\b8\u0010\u000eR\u001a\u00109\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b9\u0010\u0017\u001a\u0004\b:\u0010\u000eR\u001a\u0010;\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010\u0017\u001a\u0004\b<\u0010\u000eR\u001a\u0010=\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010\u0017\u001a\u0004\b>\u0010\u000eR\u001a\u0010?\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b?\u0010\u0017\u001a\u0004\b@\u0010\u000eR\u001a\u0010A\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bA\u0010\u0017\u001a\u0004\bB\u0010\u000eR\u001a\u0010C\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bC\u0010\u0017\u001a\u0004\bD\u0010\u000eR\u001a\u0010E\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bE\u0010\u0017\u001a\u0004\bF\u0010\u000eR\u001a\u0010G\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bG\u0010\u0017\u001a\u0004\bH\u0010\u000eR\u001a\u0010I\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bI\u0010\u0017\u001a\u0004\bJ\u0010\u000eR\u001a\u0010K\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bK\u0010\u0017\u001a\u0004\bL\u0010\u000eR\u001a\u0010M\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bM\u0010\u0017\u001a\u0004\bN\u0010\u000eR\u001a\u0010O\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bO\u0010\u0017\u001a\u0004\bP\u0010\u000eR\u001a\u0010Q\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bQ\u0010\u0017\u001a\u0004\bR\u0010\u000eR\u001a\u0010S\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bS\u0010\u0017\u001a\u0004\bT\u0010\u000eR\u001a\u0010U\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bU\u0010\u0017\u001a\u0004\bV\u0010\u000eR\u001a\u0010W\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bW\u0010\u0017\u001a\u0004\bX\u0010\u000eR\u001a\u0010Y\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bY\u0010\u0017\u001a\u0004\bZ\u0010\u000eR\u001a\u0010[\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b[\u0010\u0017\u001a\u0004\b\\\u0010\u000eR\u001a\u0010]\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b]\u0010\u0017\u001a\u0004\b^\u0010\u000eR\u001a\u0010_\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b_\u0010\u0017\u001a\u0004\b`\u0010\u000eR\u001a\u0010a\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\ba\u0010\u0017\u001a\u0004\bb\u0010\u000eR\u001a\u0010c\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bc\u0010\u0017\u001a\u0004\bd\u0010\u000eR\u001a\u0010e\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\be\u0010\u0017\u001a\u0004\bf\u0010\u000eR\u001a\u0010g\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bg\u0010\u0017\u001a\u0004\bh\u0010\u000eR\u001a\u0010i\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bi\u0010\u0017\u001a\u0004\bj\u0010\u000eR\u001a\u0010k\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bk\u0010\u0017\u001a\u0004\bl\u0010\u000eR\u001a\u0010m\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bm\u0010\u0017\u001a\u0004\bn\u0010\u000eR\u001a\u0010o\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bo\u0010\u0017\u001a\u0004\bp\u0010\u000eR\u001a\u0010q\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bq\u0010\u0017\u001a\u0004\br\u0010\u000eR\u001a\u0010s\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bs\u0010\u0017\u001a\u0004\bt\u0010\u000eR\u001a\u0010u\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bu\u0010\u0017\u001a\u0004\bv\u0010\u000eR\u001a\u0010w\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\bw\u0010\u0017\u001a\u0004\bx\u0010\u000eR\u001a\u0010y\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\by\u0010\u0017\u001a\u0004\bz\u0010\u000eR\u001a\u0010{\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b{\u0010\u0017\u001a\u0004\b|\u0010\u000eR\u001a\u0010}\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b}\u0010\u0017\u001a\u0004\b~\u0010\u000eR\u001b\u0010\u007f\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\r\n\u0004\b\u007f\u0010\u0017\u001a\u0005\b\u0080\u0001\u0010\u000eR\u001d\u0010\u0081\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0081\u0001\u0010\u0017\u001a\u0005\b\u0082\u0001\u0010\u000eR\u001d\u0010\u0083\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0083\u0001\u0010\u0017\u001a\u0005\b\u0084\u0001\u0010\u000eR\u001d\u0010\u0085\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u0017\u001a\u0005\b\u0086\u0001\u0010\u000eR\u001d\u0010\u0087\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0087\u0001\u0010\u0017\u001a\u0005\b\u0088\u0001\u0010\u000eR\u001d\u0010\u0089\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0089\u0001\u0010\u0017\u001a\u0005\b\u008a\u0001\u0010\u000eR\u001d\u0010\u008b\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010\u0017\u001a\u0005\b\u008c\u0001\u0010\u000eR\u001d\u0010\u008d\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010\u0017\u001a\u0005\b\u008e\u0001\u0010\u000eR\u001d\u0010\u008f\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010\u0017\u001a\u0005\b\u0090\u0001\u0010\u000eR\u001d\u0010\u0091\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\u0017\u001a\u0005\b\u0092\u0001\u0010\u000eR\u001d\u0010\u0093\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010\u0017\u001a\u0005\b\u0094\u0001\u0010\u000eR\u001d\u0010\u0095\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010\u0017\u001a\u0005\b\u0096\u0001\u0010\u000eR\u001d\u0010\u0097\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010\u0017\u001a\u0005\b\u0098\u0001\u0010\u000eR\u001d\u0010\u0099\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010\u0017\u001a\u0005\b\u009a\u0001\u0010\u000eR\u001d\u0010\u009b\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0017\u001a\u0005\b\u009c\u0001\u0010\u000eR\u001d\u0010\u009d\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009d\u0001\u0010\u0017\u001a\u0005\b\u009e\u0001\u0010\u000eR\u001d\u0010\u009f\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u009f\u0001\u0010\u0017\u001a\u0005\b \u0001\u0010\u000eR\u001d\u0010¡\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0017\u001a\u0005\b¢\u0001\u0010\u000eR\u001d\u0010£\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b£\u0001\u0010\u0017\u001a\u0005\b¤\u0001\u0010\u000eR\u001d\u0010¥\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¥\u0001\u0010\u0017\u001a\u0005\b¦\u0001\u0010\u000eR\u001d\u0010§\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b§\u0001\u0010\u0017\u001a\u0005\b¨\u0001\u0010\u000eR\u001d\u0010©\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b©\u0001\u0010\u0017\u001a\u0005\bª\u0001\u0010\u000eR\u001d\u0010«\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b«\u0001\u0010\u0017\u001a\u0005\b¬\u0001\u0010\u000eR\u001d\u0010\u00ad\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\u0017\u001a\u0005\b®\u0001\u0010\u000eR\u001d\u0010¯\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¯\u0001\u0010\u0017\u001a\u0005\b°\u0001\u0010\u000eR\u001d\u0010±\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b±\u0001\u0010\u0017\u001a\u0005\b²\u0001\u0010\u000eR\u001d\u0010³\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b³\u0001\u0010\u0017\u001a\u0005\b´\u0001\u0010\u000eR\u001d\u0010µ\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bµ\u0001\u0010\u0017\u001a\u0005\b¶\u0001\u0010\u000eR\u001d\u0010·\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b·\u0001\u0010\u0017\u001a\u0005\b¸\u0001\u0010\u000eR\u001d\u0010¹\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0017\u001a\u0005\bº\u0001\u0010\u000eR\u001d\u0010»\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b»\u0001\u0010\u0017\u001a\u0005\b¼\u0001\u0010\u000eR\u001d\u0010½\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b½\u0001\u0010\u0017\u001a\u0005\b¾\u0001\u0010\u000eR\u001d\u0010¿\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u0017\u001a\u0005\bÀ\u0001\u0010\u000eR\u001d\u0010Á\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÁ\u0001\u0010\u0017\u001a\u0005\bÂ\u0001\u0010\u000eR\u001d\u0010Ã\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÃ\u0001\u0010\u0017\u001a\u0005\bÄ\u0001\u0010\u000eR\u001d\u0010Å\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u0017\u001a\u0005\bÆ\u0001\u0010\u000eR\u001d\u0010Ç\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÇ\u0001\u0010\u0017\u001a\u0005\bÈ\u0001\u0010\u000eR\u001d\u0010É\u0001\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\u000e\n\u0005\bÉ\u0001\u0010\u0017\u001a\u0005\bÊ\u0001\u0010\u000e¨\u0006Í\u0001"}, d2 = {"Lcom/ybsdk/rconfig/configs/PollingConfigsImpl;", "", "", "", "jsonValues", "<init>", "(Ljava/util/Map;)V", "component1", "()Ljava/util/Map;", "copy", "(Ljava/util/Map;)Lcom/ybsdk/rconfig/configs/PollingConfigsImpl;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/Map;", "getJsonValues", "savingsAccountCreationTimeout", CA20Status.STATUS_USER_I, "getSavingsAccountCreationTimeout", "savingsAccountCreationInterval", "getSavingsAccountCreationInterval", "dashboardOpeningAccountPollingTimeout", "getDashboardOpeningAccountPollingTimeout", "dashboardOpeningAccountPollingInterval", "getDashboardOpeningAccountPollingInterval", "savingsDashboardClosingAccountIntervalMs", "getSavingsDashboardClosingAccountIntervalMs", "savingsDashboardClosingAccountTimeoutMs", "getSavingsDashboardClosingAccountTimeoutMs", "savingsDashboardV4TimeoutMs", "getSavingsDashboardV4TimeoutMs", "registrationStatusNewUserIntervalMs", "getRegistrationStatusNewUserIntervalMs", "registrationStatusNewUserTimeoutMs", "getRegistrationStatusNewUserTimeoutMs", "registrationStatusNewUserTakesTooLongTimeoutMs", "getRegistrationStatusNewUserTakesTooLongTimeoutMs", "registrationStatusOpenProductIntervalMs", "getRegistrationStatusOpenProductIntervalMs", "registrationStatusOpenProductTimeoutMs", "getRegistrationStatusOpenProductTimeoutMs", "partnerPaymentsSaveStatusIntervalMs", "getPartnerPaymentsSaveStatusIntervalMs", "partnerPaymentsSaveStatusTimeoutMs", "getPartnerPaymentsSaveStatusTimeoutMs", "autoTopupStatusTimeoutMs", "getAutoTopupStatusTimeoutMs", "autoTopupPaymentStatusTimeoutMs", "getAutoTopupPaymentStatusTimeoutMs", "autoTopupStatusIntervalMs", "getAutoTopupStatusIntervalMs", "autoTopupDefaultStatusTimeoutMs", "getAutoTopupDefaultStatusTimeoutMs", "creditPaymentMethodGetStatusTimeoutMs", "getCreditPaymentMethodGetStatusTimeoutMs", "creditPaymentMethodGetStatusIntervalMs", "getCreditPaymentMethodGetStatusIntervalMs", "changePhoneAppealHandlingTimeoutMs", "getChangePhoneAppealHandlingTimeoutMs", "changePhoneAppealHandlingIntervalMs", "getChangePhoneAppealHandlingIntervalMs", "cardWidgetInfoTimeoutMs", "getCardWidgetInfoTimeoutMs", "cardWidgetInfoIntervalMs", "getCardWidgetInfoIntervalMs", "kycApplicationInfoTimeoutMs", "getKycApplicationInfoTimeoutMs", "kycApplicationInfoIntervalMs", "getKycApplicationInfoIntervalMs", "documentsVerifyTimeoutMs", "getDocumentsVerifyTimeoutMs", "documentsVerifyIntervalMs", "getDocumentsVerifyIntervalMs", "creditDepositProcessingTimeoutMs", "getCreditDepositProcessingTimeoutMs", "creditDepositProcessingIntervalMs", "getCreditDepositProcessingIntervalMs", "splitDepositTransactionStatusIntervalMs", "getSplitDepositTransactionStatusIntervalMs", "splitDepositTransactionStatusTimeoutMs", "getSplitDepositTransactionStatusTimeoutMs", "rebindPaymentMethodGetStatusTimeoutMs", "getRebindPaymentMethodGetStatusTimeoutMs", "rebindPaymentMethodGetStatusIntervalMs", "getRebindPaymentMethodGetStatusIntervalMs", "paymentMethodsBindingTimeoutMs", "getPaymentMethodsBindingTimeoutMs", "paymentMethodsBindingIntervalMs", "getPaymentMethodsBindingIntervalMs", "ybCheckIntervalMs", "getYbCheckIntervalMs", "ybCheckTimeoutMs", "getYbCheckTimeoutMs", "cardLimitIntervalMs", "getCardLimitIntervalMs", "cardLimitTimeoutMs", "getCardLimitTimeoutMs", "cardReissueIntervalMs", "getCardReissueIntervalMs", "cardReissueTimeoutMs", "getCardReissueTimeoutMs", "cardIssueIntervalMs", "getCardIssueIntervalMs", "cardIssueTimeoutMs", "getCardIssueTimeoutMs", "divDownloaderInterval", "getDivDownloaderInterval", "divDownloaderTimeoutMs", "getDivDownloaderTimeoutMs", "me2meResultIntervalMs", "getMe2meResultIntervalMs", "me2meResultTimeoutMs", "getMe2meResultTimeoutMs", "fundCreationTimeoutMs", "getFundCreationTimeoutMs", "fundOperationTimeoutMs", "getFundOperationTimeoutMs", "fundCreationIntervalMs", "getFundCreationIntervalMs", "fundOperationIntervalMs", "getFundOperationIntervalMs", "fundDocsNoticeTimeoutMs", "getFundDocsNoticeTimeoutMs", "fundDocsNoticeIntervalMs", "getFundDocsNoticeIntervalMs", "nfcRegisterStatusIntervalMs", "getNfcRegisterStatusIntervalMs", "nfcRegisterStatusTimeoutMs", "getNfcRegisterStatusTimeoutMs", "nfcSyncWithTokensIntervalMs", "getNfcSyncWithTokensIntervalMs", "nfcSyncWithTokensTimeoutMs", "getNfcSyncWithTokensTimeoutMs", "pdfDocumentStatusIntervalMs", "getPdfDocumentStatusIntervalMs", "pdfDocumentStatusTimeoutMs", "getPdfDocumentStatusTimeoutMs", "splitContractDraftStatusTimeoutMs", "getSplitContractDraftStatusTimeoutMs", "splitContractDraftStatusIntervalMs", "getSplitContractDraftStatusIntervalMs", "qrPaymentIntervalMs", "getQrPaymentIntervalMs", "qrPaymentTimeoutMs", "getQrPaymentTimeoutMs", "transferStatusIntervalMs", "getTransferStatusIntervalMs", "transferStatusTimeoutMs", "getTransferStatusTimeoutMs", "transferStatusAftIntervalMs", "getTransferStatusAftIntervalMs", "transferStatusAftTimeoutMs", "getTransferStatusAftTimeoutMs", "replenishPaymentMethodIntervalMs", "getReplenishPaymentMethodIntervalMs", "replenishPaymentMethodTimeoutMs", "getReplenishPaymentMethodTimeoutMs", "upgradeIntervalMs", "getUpgradeIntervalMs", "upgradeTimeoutMs", "getUpgradeTimeoutMs", "simplifiedIdStatusIntervalMs", "getSimplifiedIdStatusIntervalMs", "simplifiedIdStatusTimeoutMs", "getSimplifiedIdStatusTimeoutMs", "replenishIntervalMs", "getReplenishIntervalMs", "replenishTimeoutMs", "getReplenishTimeoutMs", "proCardActivationIntervalMs", "getProCardActivationIntervalMs", "proCardActivationTimeoutMs", "getProCardActivationTimeoutMs", "checkRequiredAppsIntervalMs", "getCheckRequiredAppsIntervalMs", "checkRequiredAppsTimeoutMs", "getCheckRequiredAppsTimeoutMs", "autoTopupTestPaymentTimeoutMs", "getAutoTopupTestPaymentTimeoutMs", "autoTopupTestPaymentIntervalMs", "getAutoTopupTestPaymentIntervalMs", "checkRequiredAppsRegistrationIntervalMs", "getCheckRequiredAppsRegistrationIntervalMs", "checkRequiredAppsRegistrationTimeoutMs", "getCheckRequiredAppsRegistrationTimeoutMs", "budgetSearchStatusIntervalMs", "getBudgetSearchStatusIntervalMs", "budgetSearchStatusTimeoutMs", "getBudgetSearchStatusTimeoutMs", "defaultPaymentMethodUnifiedSetStatusIntervalMs", "getDefaultPaymentMethodUnifiedSetStatusIntervalMs", "defaultPaymentMethodUnifiedSetStatusTimeoutMs", "getDefaultPaymentMethodUnifiedSetStatusTimeoutMs", "mkkCashoutGetResultIntervalMS", "getMkkCashoutGetResultIntervalMS", "mkkCashoutGetResultTimeoutMS", "getMkkCashoutGetResultTimeoutMS", "Companion", "y1e0", "yb-sdk_sdkRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class PollingConfigsImpl {

    @Deprecated
    public static final String AUTO_TOPUP_DEFAULT_STATUS_TIMEOUT_MS = "auto_topup_default_status_timeout_ms";

    @Deprecated
    public static final String AUTO_TOPUP_PAYMENT_STATUS_TIMEOUT_MS = "auto_topup_payment_status_timeout_ms";

    @Deprecated
    public static final String AUTO_TOPUP_STATUS_INTERVAL_MS = "auto_topup_status_interval_ms";

    @Deprecated
    public static final String AUTO_TOPUP_STATUS_TIMEOUT_MS = "auto_topup_status_timeout_ms";

    @Deprecated
    public static final String AUTO_TOPUP_TEST_PAYMENT_INTERVAL_MS = "auto_topup_test_payment_interval_ms";

    @Deprecated
    public static final String AUTO_TOPUP_TEST_PAYMENT_TIMEOUT_MS = "auto_topup_test_payment_timeout_ms";

    @Deprecated
    public static final String BUDGET_SEARCH_STATUS_INTERVAL_MS = "budget_search_status_interval_ms";

    @Deprecated
    public static final String BUDGET_SEARCH_STATUS_TIMEOUT_MS = "budget_search_status_timeout_ms";

    @Deprecated
    public static final String CARD_ISSUE_INTERVAL_MS = "card_issue_interval_ms";

    @Deprecated
    public static final String CARD_ISSUE_TIMEOUT_MS = "card_issue_timeout_ms";

    @Deprecated
    public static final String CARD_LIMIT_INTERVAL_MS = "card_limit_interval_ms";

    @Deprecated
    public static final String CARD_LIMIT_TIMEOUT_MS = "card_limit_timeout_ms";

    @Deprecated
    public static final String CARD_REISSUE_INTERVAL_MS = "card_reissue_interval_ms";

    @Deprecated
    public static final String CARD_REISSUE_TIMEOUT_MS = "card_reissue_timeout_ms";

    @Deprecated
    public static final String CARD_WIDGET_INFO_INTERVAL_MS = "card_widget_info_interval_ms";

    @Deprecated
    public static final String CARD_WIDGET_INFO_TIMEOUT_MS = "card_widget_info_timeout_ms";

    @Deprecated
    public static final String CHANGE_PHONE_APPEAL_HANDLING_INTERVAL_MS = "change_phone_appeal_handling_interval_ms";

    @Deprecated
    public static final String CHANGE_PHONE_APPEAL_HANDLING_TIMEOUT_MS = "change_phone_appeal_handling_timeout_ms";

    @Deprecated
    public static final String CHECK_REQUIRED_APPS_INTERVAL_MS = "check_required_apps_interval_ms";

    @Deprecated
    public static final String CHECK_REQUIRED_APPS_REGISTRATION_INTERVAL_MS = "check_required_apps_registration_interval_ms";

    @Deprecated
    public static final String CHECK_REQUIRED_APPS_REGISTRATION_TIMEOUT_MS = "check_required_apps_registration_timeout_ms";

    @Deprecated
    public static final String CHECK_REQUIRED_APPS_TIMEOUT_MS = "check_required_apps_timeout_ms";

    @Deprecated
    public static final String CREDIT_DEPOSIT_PROCESSING_INTERVAL_MS = "credit_deposit_processing_interval_ms";

    @Deprecated
    public static final String CREDIT_DEPOSIT_PROCESSING_TIMEOUT_MS = "credit_deposit_processing_timeout_ms";

    @Deprecated
    public static final String CREDIT_PAYMENT_METHOD_GET_STATUS_INTERVAL_MS = "credit_payment_method_get_status_interval_ms";

    @Deprecated
    public static final String CREDIT_PAYMENT_METHOD_GET_STATUS_TIMEOUT_MS = "credit_payment_method_get_status_timeout_ms";
    private static final y1e0 Companion = new y1e0();

    @Deprecated
    public static final String DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_INTERVAL_MS = "default_payment_method_unified_set_status_interval_ms";

    @Deprecated
    public static final String DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_TIMEOUT_MS = "default_payment_method_unified_set_status_timeout_ms";

    @Deprecated
    public static final String DIV_DOWNLOADER_INTERVAL = "div_downloader_interval";

    @Deprecated
    public static final String DIV_DOWNLOADER_TIMEOUT_MS = "div_downloader_timeout_ms";

    @Deprecated
    public static final String DOCUMENTS_VERIFY_INTERVAL_MS = "documents_verify_interval_ms";

    @Deprecated
    public static final String DOCUMENTS_VERIFY_TIMEOUT_MS = "documents_verify_timeout_ms";

    @Deprecated
    public static final String FUND_CREATION_INTERVAL_MS = "fund_creation_interval_ms";

    @Deprecated
    public static final String FUND_CREATION_TIMEOUT_MS = "fund_creation_timeout_ms";

    @Deprecated
    public static final String FUND_DOCS_NOTICE_INTERVAL_MS = "fund_docs_notice_interval_ms";

    @Deprecated
    public static final String FUND_DOCS_NOTICE_TIMEOUT_MS = "fund_docs_notice_timeout_ms";

    @Deprecated
    public static final String FUND_OPERATION_INTERVAL_MS = "fund_operation_interval_ms";

    @Deprecated
    public static final String FUND_OPERATION_TIMEOUT_MS = "fund_operation_timeout_ms";

    @Deprecated
    public static final String KYC_APPLICATION_INFO_INTERVAL_MS = "kyc_application_info_interval_ms";

    @Deprecated
    public static final String KYC_APPLICATION_INFO_TIMEOUT_MS = "kyc_application_info_timeout_ms";

    @Deprecated
    public static final String ME2ME_RESULT_INTERVAL_MS = "me2me_result_interval_ms";

    @Deprecated
    public static final String ME2ME_RESULT_TIMEOUT_MS = "me2me_result_timeout_ms";

    @Deprecated
    public static final String MKK_CASHOUT_GET_RESULT_INTERVAL_MS = "mkk_cashout_get_result_interval_ms";

    @Deprecated
    public static final String MKK_CASHOUT_GET_RESULT_TIMEOUT_MS = "mkk_cashout_get_result_timeout_ms";

    @Deprecated
    public static final String NFC_REGISTER_STATUS_INTERVAL_MS = "nfc_register_status_interval_ms";

    @Deprecated
    public static final String NFC_REGISTER_STATUS_TIMEOUT_MS = "nfc_register_status_timeout_ms";

    @Deprecated
    public static final String NFC_SYNC_WITH_TOKENS_INTERVAL_MS = "nfc_sync_with_tokens_interval_ms";

    @Deprecated
    public static final String NFC_SYNC_WITH_TOKENS_TIMEOUT_MS = "nfc_sync_with_tokens_timeout_ms";

    @Deprecated
    public static final String PARTNER_PAYMENTS_SAVE_STATUS_INTERVAL_MS = "auto_topup_status_interval_ms";

    @Deprecated
    public static final String PARTNER_PAYMENTS_SAVE_STATUS_TIMEOUT_MS = "auto_topup_status_timeout_ms";

    @Deprecated
    public static final String PAYMENT_METHODS_BINDING_INTERVAL_MS = "payment_methods_binding_interval_ms";

    @Deprecated
    public static final String PAYMENT_METHODS_BINDING_TIMEOUT_MS = "payment_methods_binding_timeout_ms";

    @Deprecated
    public static final String PDF_DOCUMENT_STATUS_INTERVAL_MS = "pdf_document_status_interval_ms";

    @Deprecated
    public static final String PDF_DOCUMENT_STATUS_TIMEOUT_MS = "pdf_document_status_timeout_ms";

    @Deprecated
    public static final String PRO_CARD_ACTIVATION_INTERVAL_MS = "pro_card_activation_interval_ms";

    @Deprecated
    public static final String PRO_CARD_ACTIVATION_TIMEOUT_MS = "pro_card_activation_timeout_ms";

    @Deprecated
    public static final String QR_PAYMENT_INTERVAL_MS = "qr_payment_interval_ms";

    @Deprecated
    public static final String QR_PAYMENT_TIMEOUT_MS = "qr_payment_timeout_ms";

    @Deprecated
    public static final String REBIND_PAYMENT_METHOD_GET_STATUS_INTERVAL_MS = "rebind_payment_method_get_status_interval_ms";

    @Deprecated
    public static final String REBIND_PAYMENT_METHOD_GET_STATUS_TIMEOUT_MS = "rebind_payment_method_get_status_timeout_ms";

    @Deprecated
    public static final String REGISTRATION_STATUS_NEW_USER_INTERVAL = "registration_status_new_user_interval";

    @Deprecated
    public static final String REGISTRATION_STATUS_NEW_USER_TAKES_TOO_LONG_TIMEOUT_MS = "registration_status_new_user_takes_too_long_timeout_ms";

    @Deprecated
    public static final String REGISTRATION_STATUS_NEW_USER_TIMEOUT = "registration_status_new_user_timeout";

    @Deprecated
    public static final String REGISTRATION_STATUS_OPEN_PRODUCT_INTERVAL = "registration_status_open_product_interval";

    @Deprecated
    public static final String REGISTRATION_STATUS_OPEN_PRODUCT_TIMEOUT = "registration_status_open_product_timeout";

    @Deprecated
    public static final String REPLENISH_INTERVAL_MS = "replenish_interval_ms";

    @Deprecated
    public static final String REPLENISH_PAYMENT_METHOD_INTERVAL_MS = "replenish_payment_method_interval_ms";

    @Deprecated
    public static final String REPLENISH_PAYMENT_METHOD_TIMEOUT_MS = "replenish_payment_method_timeout_ms";

    @Deprecated
    public static final String REPLENISH_TIMEOUT_MS = "replenish_timeout_ms";

    @Deprecated
    public static final String SAVINGS_ACCOUNT_CREATION_INTERVAL = "savings_account_creation_interval";

    @Deprecated
    public static final String SAVINGS_ACCOUNT_CREATION_TIMEOUT = "savings_account_creation_timeout";

    @Deprecated
    public static final String SAVINGS_DASHBOARD_CLOSING_ACCOUNT_INTERVAL_MS = "savings_dashboard_closing_account_interval_ms";

    @Deprecated
    public static final String SAVINGS_DASHBOARD_CLOSING_ACCOUNT_TIMEOUT_MS = "savings_dashboard_closing_account_timeout_ms";

    @Deprecated
    public static final String SAVINGS_DASHBOARD_OPENING_INTERVAL = "savings_dashboard_interval_ms";

    @Deprecated
    public static final String SAVINGS_DASHBOARD_OPENING_TIMEOUT = "savings_dashboard_timeout_ms";

    @Deprecated
    public static final String SAVINGS_DASHBOARD_V4_TIMEOUT_MS = "savings_dashboard_v4_timeout_ms";

    @Deprecated
    public static final String SIMPLIFIED_ID_STATUS_INTERVAL_MS = "simplified_id_status_interval_ms";

    @Deprecated
    public static final String SIMPLIFIED_ID_STATUS_TIMEOUT_MS = "simplified_id_status_timeout_ms";

    @Deprecated
    public static final String SPLIT_CONTRACT_DRAFT_STATUS_INTERVAL_MS = "split_contract_draft_status_interval_ms";

    @Deprecated
    public static final String SPLIT_CONTRACT_DRAFT_STATUS_TIMEOUT_MS = "split_contract_draft_status_timeout_ms";

    @Deprecated
    public static final String SPLIT_DEPOSIT_PROCESSING_INTERVAL_MS = "split_deposit_processing_interval_ms";

    @Deprecated
    public static final String SPLIT_DEPOSIT_PROCESSING_TIMEOUT_MS = "split_deposit_processing_timeout_ms";

    @Deprecated
    public static final String TRANSFER_STATUS_AFT_INTERVAL_MS = "transfer_status_aft_interval_ms";

    @Deprecated
    public static final String TRANSFER_STATUS_AFT_TIMEOUT_MS = "transfer_status_aft_timeout_ms";

    @Deprecated
    public static final String TRANSFER_STATUS_INTERVAL_MS = "transfer_status_interval_ms";

    @Deprecated
    public static final String TRANSFER_STATUS_TIMEOUT_MS = "transfer_status_timeout_ms";

    @Deprecated
    public static final String UPGRADE_INTERVAL_MS = "upgrade_interval_ms";

    @Deprecated
    public static final String UPGRADE_TIMEOUT_MS = "upgrade_timeout_ms";

    @Deprecated
    public static final String YB_CHECK_INTERVAL_MS = "yb_check_interval_ms";

    @Deprecated
    public static final String YB_CHECK_TIMEOUT_MS = "yb_check_timeout_ms";

    @Json(name = AUTO_TOPUP_DEFAULT_STATUS_TIMEOUT_MS)
    private final int autoTopupDefaultStatusTimeoutMs;

    @Json(name = AUTO_TOPUP_PAYMENT_STATUS_TIMEOUT_MS)
    private final int autoTopupPaymentStatusTimeoutMs;

    @Json(name = "auto_topup_status_interval_ms")
    private final int autoTopupStatusIntervalMs;

    @Json(name = "auto_topup_status_timeout_ms")
    private final int autoTopupStatusTimeoutMs;

    @Json(name = AUTO_TOPUP_TEST_PAYMENT_INTERVAL_MS)
    private final int autoTopupTestPaymentIntervalMs;

    @Json(name = AUTO_TOPUP_TEST_PAYMENT_TIMEOUT_MS)
    private final int autoTopupTestPaymentTimeoutMs;

    @Json(name = BUDGET_SEARCH_STATUS_INTERVAL_MS)
    private final int budgetSearchStatusIntervalMs;

    @Json(name = BUDGET_SEARCH_STATUS_TIMEOUT_MS)
    private final int budgetSearchStatusTimeoutMs;

    @Json(name = CARD_ISSUE_INTERVAL_MS)
    private final int cardIssueIntervalMs;

    @Json(name = CARD_ISSUE_TIMEOUT_MS)
    private final int cardIssueTimeoutMs;

    @Json(name = CARD_LIMIT_INTERVAL_MS)
    private final int cardLimitIntervalMs;

    @Json(name = CARD_LIMIT_TIMEOUT_MS)
    private final int cardLimitTimeoutMs;

    @Json(name = CARD_REISSUE_INTERVAL_MS)
    private final int cardReissueIntervalMs;

    @Json(name = CARD_REISSUE_TIMEOUT_MS)
    private final int cardReissueTimeoutMs;

    @Json(name = CARD_WIDGET_INFO_INTERVAL_MS)
    private final int cardWidgetInfoIntervalMs;

    @Json(name = CARD_WIDGET_INFO_TIMEOUT_MS)
    private final int cardWidgetInfoTimeoutMs;

    @Json(name = CHANGE_PHONE_APPEAL_HANDLING_INTERVAL_MS)
    private final int changePhoneAppealHandlingIntervalMs;

    @Json(name = CHANGE_PHONE_APPEAL_HANDLING_TIMEOUT_MS)
    private final int changePhoneAppealHandlingTimeoutMs;

    @Json(name = CHECK_REQUIRED_APPS_INTERVAL_MS)
    private final int checkRequiredAppsIntervalMs;

    @Json(name = CHECK_REQUIRED_APPS_REGISTRATION_INTERVAL_MS)
    private final int checkRequiredAppsRegistrationIntervalMs;

    @Json(name = CHECK_REQUIRED_APPS_REGISTRATION_TIMEOUT_MS)
    private final int checkRequiredAppsRegistrationTimeoutMs;

    @Json(name = CHECK_REQUIRED_APPS_TIMEOUT_MS)
    private final int checkRequiredAppsTimeoutMs;

    @Json(name = CREDIT_DEPOSIT_PROCESSING_INTERVAL_MS)
    private final int creditDepositProcessingIntervalMs;

    @Json(name = CREDIT_DEPOSIT_PROCESSING_TIMEOUT_MS)
    private final int creditDepositProcessingTimeoutMs;
    private final int creditPaymentMethodGetStatusIntervalMs;
    private final int creditPaymentMethodGetStatusTimeoutMs;

    @Json(name = SAVINGS_DASHBOARD_OPENING_INTERVAL)
    private final int dashboardOpeningAccountPollingInterval;

    @Json(name = SAVINGS_DASHBOARD_OPENING_TIMEOUT)
    private final int dashboardOpeningAccountPollingTimeout;

    @Json(name = DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_INTERVAL_MS)
    private final int defaultPaymentMethodUnifiedSetStatusIntervalMs;

    @Json(name = DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_TIMEOUT_MS)
    private final int defaultPaymentMethodUnifiedSetStatusTimeoutMs;

    @Json(name = DIV_DOWNLOADER_INTERVAL)
    private final int divDownloaderInterval;

    @Json(name = DIV_DOWNLOADER_TIMEOUT_MS)
    private final int divDownloaderTimeoutMs;

    @Json(name = DOCUMENTS_VERIFY_INTERVAL_MS)
    private final int documentsVerifyIntervalMs;

    @Json(name = DOCUMENTS_VERIFY_TIMEOUT_MS)
    private final int documentsVerifyTimeoutMs;

    @Json(name = FUND_CREATION_INTERVAL_MS)
    private final int fundCreationIntervalMs;

    @Json(name = FUND_CREATION_TIMEOUT_MS)
    private final int fundCreationTimeoutMs;

    @Json(name = FUND_DOCS_NOTICE_INTERVAL_MS)
    private final int fundDocsNoticeIntervalMs;

    @Json(name = FUND_DOCS_NOTICE_TIMEOUT_MS)
    private final int fundDocsNoticeTimeoutMs;

    @Json(name = FUND_OPERATION_INTERVAL_MS)
    private final int fundOperationIntervalMs;

    @Json(name = FUND_OPERATION_TIMEOUT_MS)
    private final int fundOperationTimeoutMs;
    private final Map<String, Integer> jsonValues;

    @Json(name = KYC_APPLICATION_INFO_INTERVAL_MS)
    private final int kycApplicationInfoIntervalMs;

    @Json(name = KYC_APPLICATION_INFO_TIMEOUT_MS)
    private final int kycApplicationInfoTimeoutMs;

    @Json(name = ME2ME_RESULT_INTERVAL_MS)
    private final int me2meResultIntervalMs;

    @Json(name = ME2ME_RESULT_TIMEOUT_MS)
    private final int me2meResultTimeoutMs;

    @Json(name = MKK_CASHOUT_GET_RESULT_INTERVAL_MS)
    private final int mkkCashoutGetResultIntervalMS;

    @Json(name = MKK_CASHOUT_GET_RESULT_TIMEOUT_MS)
    private final int mkkCashoutGetResultTimeoutMS;

    @Json(name = NFC_REGISTER_STATUS_INTERVAL_MS)
    private final int nfcRegisterStatusIntervalMs;

    @Json(name = NFC_REGISTER_STATUS_TIMEOUT_MS)
    private final int nfcRegisterStatusTimeoutMs;

    @Json(name = NFC_SYNC_WITH_TOKENS_INTERVAL_MS)
    private final int nfcSyncWithTokensIntervalMs;

    @Json(name = NFC_SYNC_WITH_TOKENS_TIMEOUT_MS)
    private final int nfcSyncWithTokensTimeoutMs;

    @Json(name = "auto_topup_status_interval_ms")
    private final int partnerPaymentsSaveStatusIntervalMs;

    @Json(name = "auto_topup_status_timeout_ms")
    private final int partnerPaymentsSaveStatusTimeoutMs;

    @Json(name = PAYMENT_METHODS_BINDING_INTERVAL_MS)
    private final int paymentMethodsBindingIntervalMs;

    @Json(name = PAYMENT_METHODS_BINDING_TIMEOUT_MS)
    private final int paymentMethodsBindingTimeoutMs;

    @Json(name = PDF_DOCUMENT_STATUS_INTERVAL_MS)
    private final int pdfDocumentStatusIntervalMs;

    @Json(name = PDF_DOCUMENT_STATUS_TIMEOUT_MS)
    private final int pdfDocumentStatusTimeoutMs;

    @Json(name = PRO_CARD_ACTIVATION_INTERVAL_MS)
    private final int proCardActivationIntervalMs;

    @Json(name = PRO_CARD_ACTIVATION_TIMEOUT_MS)
    private final int proCardActivationTimeoutMs;

    @Json(name = QR_PAYMENT_INTERVAL_MS)
    private final int qrPaymentIntervalMs;

    @Json(name = QR_PAYMENT_TIMEOUT_MS)
    private final int qrPaymentTimeoutMs;

    @Json(name = REBIND_PAYMENT_METHOD_GET_STATUS_INTERVAL_MS)
    private final int rebindPaymentMethodGetStatusIntervalMs;

    @Json(name = REBIND_PAYMENT_METHOD_GET_STATUS_TIMEOUT_MS)
    private final int rebindPaymentMethodGetStatusTimeoutMs;

    @Json(name = REGISTRATION_STATUS_NEW_USER_INTERVAL)
    private final int registrationStatusNewUserIntervalMs;

    @Json(name = REGISTRATION_STATUS_NEW_USER_TAKES_TOO_LONG_TIMEOUT_MS)
    private final int registrationStatusNewUserTakesTooLongTimeoutMs;

    @Json(name = REGISTRATION_STATUS_NEW_USER_TIMEOUT)
    private final int registrationStatusNewUserTimeoutMs;

    @Json(name = REGISTRATION_STATUS_OPEN_PRODUCT_INTERVAL)
    private final int registrationStatusOpenProductIntervalMs;

    @Json(name = REGISTRATION_STATUS_OPEN_PRODUCT_TIMEOUT)
    private final int registrationStatusOpenProductTimeoutMs;

    @Json(name = REPLENISH_INTERVAL_MS)
    private final int replenishIntervalMs;

    @Json(name = REPLENISH_PAYMENT_METHOD_INTERVAL_MS)
    private final int replenishPaymentMethodIntervalMs;

    @Json(name = REPLENISH_PAYMENT_METHOD_TIMEOUT_MS)
    private final int replenishPaymentMethodTimeoutMs;

    @Json(name = REPLENISH_TIMEOUT_MS)
    private final int replenishTimeoutMs;

    @Json(name = SAVINGS_ACCOUNT_CREATION_INTERVAL)
    private final int savingsAccountCreationInterval;

    @Json(name = SAVINGS_ACCOUNT_CREATION_TIMEOUT)
    private final int savingsAccountCreationTimeout;

    @Json(name = SAVINGS_DASHBOARD_CLOSING_ACCOUNT_INTERVAL_MS)
    private final int savingsDashboardClosingAccountIntervalMs;

    @Json(name = SAVINGS_DASHBOARD_CLOSING_ACCOUNT_TIMEOUT_MS)
    private final int savingsDashboardClosingAccountTimeoutMs;

    @Json(name = SAVINGS_DASHBOARD_V4_TIMEOUT_MS)
    private final int savingsDashboardV4TimeoutMs;

    @Json(name = SIMPLIFIED_ID_STATUS_INTERVAL_MS)
    private final int simplifiedIdStatusIntervalMs;

    @Json(name = SIMPLIFIED_ID_STATUS_TIMEOUT_MS)
    private final int simplifiedIdStatusTimeoutMs;

    @Json(name = SPLIT_CONTRACT_DRAFT_STATUS_INTERVAL_MS)
    private final int splitContractDraftStatusIntervalMs;

    @Json(name = SPLIT_CONTRACT_DRAFT_STATUS_TIMEOUT_MS)
    private final int splitContractDraftStatusTimeoutMs;

    @Json(name = SPLIT_DEPOSIT_PROCESSING_INTERVAL_MS)
    private final int splitDepositTransactionStatusIntervalMs;

    @Json(name = SPLIT_DEPOSIT_PROCESSING_TIMEOUT_MS)
    private final int splitDepositTransactionStatusTimeoutMs;

    @Json(name = TRANSFER_STATUS_AFT_INTERVAL_MS)
    private final int transferStatusAftIntervalMs;

    @Json(name = TRANSFER_STATUS_AFT_TIMEOUT_MS)
    private final int transferStatusAftTimeoutMs;

    @Json(name = TRANSFER_STATUS_INTERVAL_MS)
    private final int transferStatusIntervalMs;

    @Json(name = TRANSFER_STATUS_TIMEOUT_MS)
    private final int transferStatusTimeoutMs;

    @Json(name = UPGRADE_INTERVAL_MS)
    private final int upgradeIntervalMs;

    @Json(name = UPGRADE_TIMEOUT_MS)
    private final int upgradeTimeoutMs;

    @Json(name = YB_CHECK_INTERVAL_MS)
    private final int ybCheckIntervalMs;

    @Json(name = YB_CHECK_TIMEOUT_MS)
    private final int ybCheckTimeoutMs;

    public PollingConfigsImpl(Map<String, Integer> map) {
        this.jsonValues = map;
        Integer num = map.get(SAVINGS_ACCOUNT_CREATION_TIMEOUT);
        this.savingsAccountCreationTimeout = num != null ? num.intValue() : 10000;
        Integer num2 = map.get(SAVINGS_ACCOUNT_CREATION_INTERVAL);
        this.savingsAccountCreationInterval = num2 != null ? num2.intValue() : 1000;
        Integer num3 = map.get(SAVINGS_DASHBOARD_OPENING_TIMEOUT);
        this.dashboardOpeningAccountPollingTimeout = num3 != null ? num3.intValue() : 60000;
        Integer num4 = map.get(SAVINGS_DASHBOARD_OPENING_INTERVAL);
        this.dashboardOpeningAccountPollingInterval = num4 != null ? num4.intValue() : 1000;
        Integer num5 = map.get(SAVINGS_DASHBOARD_CLOSING_ACCOUNT_INTERVAL_MS);
        this.savingsDashboardClosingAccountIntervalMs = num5 != null ? num5.intValue() : 1000;
        Integer num6 = map.get(SAVINGS_DASHBOARD_CLOSING_ACCOUNT_TIMEOUT_MS);
        this.savingsDashboardClosingAccountTimeoutMs = num6 != null ? num6.intValue() : 600000;
        Integer num7 = map.get(SAVINGS_DASHBOARD_V4_TIMEOUT_MS);
        this.savingsDashboardV4TimeoutMs = num7 != null ? num7.intValue() : 600000;
        Integer num8 = map.get(REGISTRATION_STATUS_NEW_USER_INTERVAL);
        this.registrationStatusNewUserIntervalMs = num8 != null ? num8.intValue() : 1000;
        Integer num9 = map.get(REGISTRATION_STATUS_NEW_USER_TIMEOUT);
        this.registrationStatusNewUserTimeoutMs = num9 != null ? num9.intValue() : 60000;
        Integer num10 = map.get(REGISTRATION_STATUS_NEW_USER_TAKES_TOO_LONG_TIMEOUT_MS);
        this.registrationStatusNewUserTakesTooLongTimeoutMs = num10 != null ? num10.intValue() : 10000;
        Integer num11 = map.get(REGISTRATION_STATUS_OPEN_PRODUCT_INTERVAL);
        this.registrationStatusOpenProductIntervalMs = num11 != null ? num11.intValue() : 1000;
        Integer num12 = map.get(REGISTRATION_STATUS_OPEN_PRODUCT_TIMEOUT);
        this.registrationStatusOpenProductTimeoutMs = num12 != null ? num12.intValue() : 60000;
        Integer num13 = map.get("auto_topup_status_interval_ms");
        this.partnerPaymentsSaveStatusIntervalMs = num13 != null ? num13.intValue() : 1000;
        Integer num14 = map.get("auto_topup_status_timeout_ms");
        this.partnerPaymentsSaveStatusTimeoutMs = num14 != null ? num14.intValue() : 60000;
        Integer num15 = map.get("auto_topup_status_timeout_ms");
        this.autoTopupStatusTimeoutMs = num15 != null ? num15.intValue() : 15000;
        Integer num16 = map.get(AUTO_TOPUP_PAYMENT_STATUS_TIMEOUT_MS);
        this.autoTopupPaymentStatusTimeoutMs = num16 != null ? num16.intValue() : 600000;
        Integer num17 = map.get("auto_topup_status_interval_ms");
        this.autoTopupStatusIntervalMs = num17 != null ? num17.intValue() : 1000;
        Integer num18 = map.get(AUTO_TOPUP_DEFAULT_STATUS_TIMEOUT_MS);
        this.autoTopupDefaultStatusTimeoutMs = num18 != null ? num18.intValue() : 60000;
        Integer num19 = map.get(CREDIT_PAYMENT_METHOD_GET_STATUS_TIMEOUT_MS);
        this.creditPaymentMethodGetStatusTimeoutMs = num19 != null ? num19.intValue() : 60000;
        Integer num20 = map.get(CREDIT_PAYMENT_METHOD_GET_STATUS_INTERVAL_MS);
        this.creditPaymentMethodGetStatusIntervalMs = num20 != null ? num20.intValue() : 1000;
        Integer num21 = map.get(CHANGE_PHONE_APPEAL_HANDLING_TIMEOUT_MS);
        this.changePhoneAppealHandlingTimeoutMs = num21 != null ? num21.intValue() : 60000;
        Integer num22 = map.get(CHANGE_PHONE_APPEAL_HANDLING_INTERVAL_MS);
        this.changePhoneAppealHandlingIntervalMs = num22 != null ? num22.intValue() : 1000;
        Integer num23 = map.get(CARD_WIDGET_INFO_TIMEOUT_MS);
        this.cardWidgetInfoTimeoutMs = num23 != null ? num23.intValue() : 60000;
        Integer num24 = map.get(CARD_WIDGET_INFO_INTERVAL_MS);
        this.cardWidgetInfoIntervalMs = num24 != null ? num24.intValue() : 1000;
        Integer num25 = map.get(KYC_APPLICATION_INFO_TIMEOUT_MS);
        this.kycApplicationInfoTimeoutMs = num25 != null ? num25.intValue() : 60000;
        Integer num26 = map.get(KYC_APPLICATION_INFO_INTERVAL_MS);
        this.kycApplicationInfoIntervalMs = num26 != null ? num26.intValue() : 1000;
        Integer num27 = map.get(DOCUMENTS_VERIFY_TIMEOUT_MS);
        this.documentsVerifyTimeoutMs = num27 != null ? num27.intValue() : 60000;
        Integer num28 = map.get(DOCUMENTS_VERIFY_INTERVAL_MS);
        this.documentsVerifyIntervalMs = num28 != null ? num28.intValue() : 1000;
        Integer num29 = map.get(CREDIT_DEPOSIT_PROCESSING_TIMEOUT_MS);
        this.creditDepositProcessingTimeoutMs = num29 != null ? num29.intValue() : 180000;
        Integer num30 = map.get(CREDIT_DEPOSIT_PROCESSING_INTERVAL_MS);
        this.creditDepositProcessingIntervalMs = num30 != null ? num30.intValue() : 1000;
        Integer num31 = map.get(SPLIT_DEPOSIT_PROCESSING_INTERVAL_MS);
        this.splitDepositTransactionStatusIntervalMs = num31 != null ? num31.intValue() : 1000;
        Integer num32 = map.get(SPLIT_DEPOSIT_PROCESSING_TIMEOUT_MS);
        this.splitDepositTransactionStatusTimeoutMs = num32 != null ? num32.intValue() : 180000;
        Integer num33 = map.get(REBIND_PAYMENT_METHOD_GET_STATUS_TIMEOUT_MS);
        this.rebindPaymentMethodGetStatusTimeoutMs = num33 != null ? num33.intValue() : 60000;
        Integer num34 = map.get(REBIND_PAYMENT_METHOD_GET_STATUS_INTERVAL_MS);
        this.rebindPaymentMethodGetStatusIntervalMs = num34 != null ? num34.intValue() : 1000;
        Integer num35 = map.get(PAYMENT_METHODS_BINDING_TIMEOUT_MS);
        this.paymentMethodsBindingTimeoutMs = num35 != null ? num35.intValue() : Integer.MAX_VALUE;
        Integer num36 = map.get(PAYMENT_METHODS_BINDING_INTERVAL_MS);
        this.paymentMethodsBindingIntervalMs = num36 != null ? num36.intValue() : 1000;
        Integer num37 = map.get(tje.q(tje.k));
        this.ybCheckIntervalMs = num37 != null ? num37.intValue() : 1000;
        Integer num38 = map.get(tje.q(tje.S0));
        this.ybCheckTimeoutMs = num38 != null ? num38.intValue() : 60000;
        Integer num39 = map.get(CARD_LIMIT_INTERVAL_MS);
        this.cardLimitIntervalMs = num39 != null ? num39.intValue() : 1000;
        Integer num40 = map.get(CARD_LIMIT_TIMEOUT_MS);
        this.cardLimitTimeoutMs = num40 != null ? num40.intValue() : 60000;
        Integer num41 = map.get(CARD_REISSUE_INTERVAL_MS);
        this.cardReissueIntervalMs = num41 != null ? num41.intValue() : 1000;
        Integer num42 = map.get(CARD_REISSUE_TIMEOUT_MS);
        this.cardReissueTimeoutMs = num42 != null ? num42.intValue() : 60000;
        Integer num43 = map.get(CARD_ISSUE_INTERVAL_MS);
        this.cardIssueIntervalMs = num43 != null ? num43.intValue() : 1000;
        Integer num44 = map.get(CARD_ISSUE_TIMEOUT_MS);
        this.cardIssueTimeoutMs = num44 != null ? num44.intValue() : 60000;
        Integer num45 = map.get(DIV_DOWNLOADER_INTERVAL);
        this.divDownloaderInterval = num45 != null ? num45.intValue() : 1000;
        Integer num46 = map.get(DIV_DOWNLOADER_TIMEOUT_MS);
        this.divDownloaderTimeoutMs = num46 != null ? num46.intValue() : 60000;
        Integer num47 = map.get(ME2ME_RESULT_INTERVAL_MS);
        this.me2meResultIntervalMs = num47 != null ? num47.intValue() : 1000;
        Integer num48 = this.jsonValues.get(ME2ME_RESULT_TIMEOUT_MS);
        this.me2meResultTimeoutMs = num48 != null ? num48.intValue() : 60000;
        Integer num49 = this.jsonValues.get(FUND_CREATION_TIMEOUT_MS);
        this.fundCreationTimeoutMs = num49 != null ? num49.intValue() : 60000;
        Integer num50 = this.jsonValues.get(FUND_OPERATION_TIMEOUT_MS);
        this.fundOperationTimeoutMs = num50 != null ? num50.intValue() : 60000;
        Integer num51 = this.jsonValues.get(FUND_CREATION_INTERVAL_MS);
        this.fundCreationIntervalMs = num51 != null ? num51.intValue() : 1000;
        Integer num52 = this.jsonValues.get(FUND_OPERATION_INTERVAL_MS);
        this.fundOperationIntervalMs = num52 != null ? num52.intValue() : 1000;
        Integer num53 = this.jsonValues.get(FUND_DOCS_NOTICE_TIMEOUT_MS);
        this.fundDocsNoticeTimeoutMs = num53 != null ? num53.intValue() : 60000;
        Integer num54 = this.jsonValues.get(FUND_DOCS_NOTICE_INTERVAL_MS);
        this.fundDocsNoticeIntervalMs = num54 != null ? num54.intValue() : 1000;
        Integer num55 = this.jsonValues.get(NFC_REGISTER_STATUS_INTERVAL_MS);
        this.nfcRegisterStatusIntervalMs = num55 != null ? num55.intValue() : 1000;
        Integer num56 = this.jsonValues.get(NFC_REGISTER_STATUS_TIMEOUT_MS);
        this.nfcRegisterStatusTimeoutMs = num56 != null ? num56.intValue() : 60000;
        Integer num57 = this.jsonValues.get(NFC_SYNC_WITH_TOKENS_INTERVAL_MS);
        this.nfcSyncWithTokensIntervalMs = num57 != null ? num57.intValue() : 1000;
        Integer num58 = this.jsonValues.get(NFC_SYNC_WITH_TOKENS_TIMEOUT_MS);
        this.nfcSyncWithTokensTimeoutMs = num58 != null ? num58.intValue() : 60000;
        Integer num59 = this.jsonValues.get(PDF_DOCUMENT_STATUS_INTERVAL_MS);
        this.pdfDocumentStatusIntervalMs = num59 != null ? num59.intValue() : 1000;
        Integer num60 = this.jsonValues.get(PDF_DOCUMENT_STATUS_TIMEOUT_MS);
        this.pdfDocumentStatusTimeoutMs = num60 != null ? num60.intValue() : 60000;
        Integer num61 = this.jsonValues.get(SPLIT_CONTRACT_DRAFT_STATUS_TIMEOUT_MS);
        this.splitContractDraftStatusTimeoutMs = num61 != null ? num61.intValue() : 60000;
        Integer num62 = this.jsonValues.get(SPLIT_CONTRACT_DRAFT_STATUS_INTERVAL_MS);
        this.splitContractDraftStatusIntervalMs = num62 != null ? num62.intValue() : 1000;
        Integer num63 = this.jsonValues.get(QR_PAYMENT_INTERVAL_MS);
        this.qrPaymentIntervalMs = num63 != null ? num63.intValue() : 1000;
        Integer num64 = this.jsonValues.get(QR_PAYMENT_TIMEOUT_MS);
        this.qrPaymentTimeoutMs = num64 != null ? num64.intValue() : 60000;
        Integer num65 = this.jsonValues.get(TRANSFER_STATUS_INTERVAL_MS);
        this.transferStatusIntervalMs = num65 != null ? num65.intValue() : 1000;
        Integer num66 = this.jsonValues.get(TRANSFER_STATUS_TIMEOUT_MS);
        this.transferStatusTimeoutMs = num66 != null ? num66.intValue() : 15000;
        Integer num67 = this.jsonValues.get(TRANSFER_STATUS_AFT_INTERVAL_MS);
        this.transferStatusAftIntervalMs = num67 != null ? num67.intValue() : 1000;
        Integer num68 = this.jsonValues.get(TRANSFER_STATUS_AFT_TIMEOUT_MS);
        this.transferStatusAftTimeoutMs = num68 != null ? num68.intValue() : 60000;
        Integer num69 = this.jsonValues.get(REPLENISH_PAYMENT_METHOD_INTERVAL_MS);
        this.replenishPaymentMethodIntervalMs = num69 != null ? num69.intValue() : 1000;
        Integer num70 = this.jsonValues.get(REPLENISH_PAYMENT_METHOD_TIMEOUT_MS);
        this.replenishPaymentMethodTimeoutMs = num70 != null ? num70.intValue() : 10000;
        Integer num71 = this.jsonValues.get(UPGRADE_INTERVAL_MS);
        this.upgradeIntervalMs = num71 != null ? num71.intValue() : 1000;
        Integer num72 = this.jsonValues.get(UPGRADE_TIMEOUT_MS);
        this.upgradeTimeoutMs = num72 != null ? num72.intValue() : 60000;
        Integer num73 = this.jsonValues.get(SIMPLIFIED_ID_STATUS_INTERVAL_MS);
        this.simplifiedIdStatusIntervalMs = num73 != null ? num73.intValue() : 1000;
        Integer num74 = this.jsonValues.get(SIMPLIFIED_ID_STATUS_TIMEOUT_MS);
        this.simplifiedIdStatusTimeoutMs = num74 != null ? num74.intValue() : 60000;
        Integer num75 = this.jsonValues.get(REPLENISH_INTERVAL_MS);
        this.replenishIntervalMs = num75 != null ? num75.intValue() : 1000;
        Integer num76 = this.jsonValues.get(REPLENISH_TIMEOUT_MS);
        this.replenishTimeoutMs = num76 != null ? num76.intValue() : 60000;
        Integer num77 = this.jsonValues.get(PRO_CARD_ACTIVATION_INTERVAL_MS);
        this.proCardActivationIntervalMs = num77 != null ? num77.intValue() : 1000;
        Integer num78 = this.jsonValues.get(PRO_CARD_ACTIVATION_TIMEOUT_MS);
        this.proCardActivationTimeoutMs = num78 != null ? num78.intValue() : 60000;
        Integer num79 = this.jsonValues.get(CHECK_REQUIRED_APPS_INTERVAL_MS);
        this.checkRequiredAppsIntervalMs = num79 != null ? num79.intValue() : 1000;
        Integer num80 = this.jsonValues.get(CHECK_REQUIRED_APPS_TIMEOUT_MS);
        this.checkRequiredAppsTimeoutMs = num80 != null ? num80.intValue() : 60000;
        Integer num81 = this.jsonValues.get(AUTO_TOPUP_TEST_PAYMENT_TIMEOUT_MS);
        this.autoTopupTestPaymentTimeoutMs = num81 != null ? num81.intValue() : 60000;
        Integer num82 = this.jsonValues.get(AUTO_TOPUP_TEST_PAYMENT_INTERVAL_MS);
        this.autoTopupTestPaymentIntervalMs = num82 != null ? num82.intValue() : 1000;
        Integer num83 = this.jsonValues.get(CHECK_REQUIRED_APPS_REGISTRATION_INTERVAL_MS);
        this.checkRequiredAppsRegistrationIntervalMs = num83 != null ? num83.intValue() : 1000;
        Integer num84 = this.jsonValues.get(CHECK_REQUIRED_APPS_REGISTRATION_TIMEOUT_MS);
        this.checkRequiredAppsRegistrationTimeoutMs = num84 != null ? num84.intValue() : 60000;
        Integer num85 = this.jsonValues.get(BUDGET_SEARCH_STATUS_INTERVAL_MS);
        this.budgetSearchStatusIntervalMs = num85 != null ? num85.intValue() : 1000;
        Integer num86 = this.jsonValues.get(BUDGET_SEARCH_STATUS_TIMEOUT_MS);
        this.budgetSearchStatusTimeoutMs = num86 != null ? num86.intValue() : 10000;
        Integer num87 = this.jsonValues.get(DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_INTERVAL_MS);
        this.defaultPaymentMethodUnifiedSetStatusIntervalMs = num87 != null ? num87.intValue() : 1000;
        Integer num88 = this.jsonValues.get(DEFAULT_PAYMENT_METHOD_UNIFIED_SET_STATUS_TIMEOUT_MS);
        this.defaultPaymentMethodUnifiedSetStatusTimeoutMs = num88 != null ? num88.intValue() : 600000;
        Integer num89 = this.jsonValues.get(MKK_CASHOUT_GET_RESULT_INTERVAL_MS);
        this.mkkCashoutGetResultIntervalMS = num89 != null ? num89.intValue() : 1000;
        Integer num90 = this.jsonValues.get(MKK_CASHOUT_GET_RESULT_TIMEOUT_MS);
        this.mkkCashoutGetResultTimeoutMS = num90 != null ? num90.intValue() : 60000;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PollingConfigsImpl copy$default(PollingConfigsImpl pollingConfigsImpl, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = pollingConfigsImpl.jsonValues;
        }
        return pollingConfigsImpl.copy(map);
    }

    public final Map<String, Integer> component1() {
        return this.jsonValues;
    }

    public final PollingConfigsImpl copy(Map<String, Integer> jsonValues) {
        return new PollingConfigsImpl(jsonValues);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof PollingConfigsImpl) && jl40.l(this.jsonValues, ((PollingConfigsImpl) other).jsonValues);
    }

    public int getAutoTopupDefaultStatusTimeoutMs() {
        return this.autoTopupDefaultStatusTimeoutMs;
    }

    public int getAutoTopupPaymentStatusTimeoutMs() {
        return this.autoTopupPaymentStatusTimeoutMs;
    }

    public int getAutoTopupStatusIntervalMs() {
        return this.autoTopupStatusIntervalMs;
    }

    public int getAutoTopupStatusTimeoutMs() {
        return this.autoTopupStatusTimeoutMs;
    }

    public int getAutoTopupTestPaymentIntervalMs() {
        return this.autoTopupTestPaymentIntervalMs;
    }

    public int getAutoTopupTestPaymentTimeoutMs() {
        return this.autoTopupTestPaymentTimeoutMs;
    }

    public int getBudgetSearchStatusIntervalMs() {
        return this.budgetSearchStatusIntervalMs;
    }

    public int getBudgetSearchStatusTimeoutMs() {
        return this.budgetSearchStatusTimeoutMs;
    }

    public int getCardIssueIntervalMs() {
        return this.cardIssueIntervalMs;
    }

    public int getCardIssueTimeoutMs() {
        return this.cardIssueTimeoutMs;
    }

    public int getCardLimitIntervalMs() {
        return this.cardLimitIntervalMs;
    }

    public int getCardLimitTimeoutMs() {
        return this.cardLimitTimeoutMs;
    }

    public int getCardReissueIntervalMs() {
        return this.cardReissueIntervalMs;
    }

    public int getCardReissueTimeoutMs() {
        return this.cardReissueTimeoutMs;
    }

    public int getCardWidgetInfoIntervalMs() {
        return this.cardWidgetInfoIntervalMs;
    }

    public int getCardWidgetInfoTimeoutMs() {
        return this.cardWidgetInfoTimeoutMs;
    }

    public int getChangePhoneAppealHandlingIntervalMs() {
        return this.changePhoneAppealHandlingIntervalMs;
    }

    public int getChangePhoneAppealHandlingTimeoutMs() {
        return this.changePhoneAppealHandlingTimeoutMs;
    }

    public int getCheckRequiredAppsIntervalMs() {
        return this.checkRequiredAppsIntervalMs;
    }

    public int getCheckRequiredAppsRegistrationIntervalMs() {
        return this.checkRequiredAppsRegistrationIntervalMs;
    }

    public int getCheckRequiredAppsRegistrationTimeoutMs() {
        return this.checkRequiredAppsRegistrationTimeoutMs;
    }

    public int getCheckRequiredAppsTimeoutMs() {
        return this.checkRequiredAppsTimeoutMs;
    }

    public int getCreditDepositProcessingIntervalMs() {
        return this.creditDepositProcessingIntervalMs;
    }

    public int getCreditDepositProcessingTimeoutMs() {
        return this.creditDepositProcessingTimeoutMs;
    }

    public int getCreditPaymentMethodGetStatusIntervalMs() {
        return this.creditPaymentMethodGetStatusIntervalMs;
    }

    public int getCreditPaymentMethodGetStatusTimeoutMs() {
        return this.creditPaymentMethodGetStatusTimeoutMs;
    }

    public int getDashboardOpeningAccountPollingInterval() {
        return this.dashboardOpeningAccountPollingInterval;
    }

    public int getDashboardOpeningAccountPollingTimeout() {
        return this.dashboardOpeningAccountPollingTimeout;
    }

    public int getDefaultPaymentMethodUnifiedSetStatusIntervalMs() {
        return this.defaultPaymentMethodUnifiedSetStatusIntervalMs;
    }

    public int getDefaultPaymentMethodUnifiedSetStatusTimeoutMs() {
        return this.defaultPaymentMethodUnifiedSetStatusTimeoutMs;
    }

    public int getDivDownloaderInterval() {
        return this.divDownloaderInterval;
    }

    public int getDivDownloaderTimeoutMs() {
        return this.divDownloaderTimeoutMs;
    }

    public int getDocumentsVerifyIntervalMs() {
        return this.documentsVerifyIntervalMs;
    }

    public int getDocumentsVerifyTimeoutMs() {
        return this.documentsVerifyTimeoutMs;
    }

    public int getFundCreationIntervalMs() {
        return this.fundCreationIntervalMs;
    }

    public int getFundCreationTimeoutMs() {
        return this.fundCreationTimeoutMs;
    }

    public int getFundDocsNoticeIntervalMs() {
        return this.fundDocsNoticeIntervalMs;
    }

    public int getFundDocsNoticeTimeoutMs() {
        return this.fundDocsNoticeTimeoutMs;
    }

    public int getFundOperationIntervalMs() {
        return this.fundOperationIntervalMs;
    }

    public int getFundOperationTimeoutMs() {
        return this.fundOperationTimeoutMs;
    }

    public final Map<String, Integer> getJsonValues() {
        return this.jsonValues;
    }

    public int getKycApplicationInfoIntervalMs() {
        return this.kycApplicationInfoIntervalMs;
    }

    public int getKycApplicationInfoTimeoutMs() {
        return this.kycApplicationInfoTimeoutMs;
    }

    public int getMe2meResultIntervalMs() {
        return this.me2meResultIntervalMs;
    }

    public int getMe2meResultTimeoutMs() {
        return this.me2meResultTimeoutMs;
    }

    public int getMkkCashoutGetResultIntervalMS() {
        return this.mkkCashoutGetResultIntervalMS;
    }

    public int getMkkCashoutGetResultTimeoutMS() {
        return this.mkkCashoutGetResultTimeoutMS;
    }

    public int getNfcRegisterStatusIntervalMs() {
        return this.nfcRegisterStatusIntervalMs;
    }

    public int getNfcRegisterStatusTimeoutMs() {
        return this.nfcRegisterStatusTimeoutMs;
    }

    public int getNfcSyncWithTokensIntervalMs() {
        return this.nfcSyncWithTokensIntervalMs;
    }

    public int getNfcSyncWithTokensTimeoutMs() {
        return this.nfcSyncWithTokensTimeoutMs;
    }

    public int getPartnerPaymentsSaveStatusIntervalMs() {
        return this.partnerPaymentsSaveStatusIntervalMs;
    }

    public int getPartnerPaymentsSaveStatusTimeoutMs() {
        return this.partnerPaymentsSaveStatusTimeoutMs;
    }

    public int getPaymentMethodsBindingIntervalMs() {
        return this.paymentMethodsBindingIntervalMs;
    }

    public int getPaymentMethodsBindingTimeoutMs() {
        return this.paymentMethodsBindingTimeoutMs;
    }

    public int getPdfDocumentStatusIntervalMs() {
        return this.pdfDocumentStatusIntervalMs;
    }

    public int getPdfDocumentStatusTimeoutMs() {
        return this.pdfDocumentStatusTimeoutMs;
    }

    public int getProCardActivationIntervalMs() {
        return this.proCardActivationIntervalMs;
    }

    public int getProCardActivationTimeoutMs() {
        return this.proCardActivationTimeoutMs;
    }

    public int getQrPaymentIntervalMs() {
        return this.qrPaymentIntervalMs;
    }

    public int getQrPaymentTimeoutMs() {
        return this.qrPaymentTimeoutMs;
    }

    public int getRebindPaymentMethodGetStatusIntervalMs() {
        return this.rebindPaymentMethodGetStatusIntervalMs;
    }

    public int getRebindPaymentMethodGetStatusTimeoutMs() {
        return this.rebindPaymentMethodGetStatusTimeoutMs;
    }

    public int getRegistrationStatusNewUserIntervalMs() {
        return this.registrationStatusNewUserIntervalMs;
    }

    public int getRegistrationStatusNewUserTakesTooLongTimeoutMs() {
        return this.registrationStatusNewUserTakesTooLongTimeoutMs;
    }

    public int getRegistrationStatusNewUserTimeoutMs() {
        return this.registrationStatusNewUserTimeoutMs;
    }

    public int getRegistrationStatusOpenProductIntervalMs() {
        return this.registrationStatusOpenProductIntervalMs;
    }

    public int getRegistrationStatusOpenProductTimeoutMs() {
        return this.registrationStatusOpenProductTimeoutMs;
    }

    public int getReplenishIntervalMs() {
        return this.replenishIntervalMs;
    }

    public int getReplenishPaymentMethodIntervalMs() {
        return this.replenishPaymentMethodIntervalMs;
    }

    public int getReplenishPaymentMethodTimeoutMs() {
        return this.replenishPaymentMethodTimeoutMs;
    }

    public int getReplenishTimeoutMs() {
        return this.replenishTimeoutMs;
    }

    public int getSavingsAccountCreationInterval() {
        return this.savingsAccountCreationInterval;
    }

    public int getSavingsAccountCreationTimeout() {
        return this.savingsAccountCreationTimeout;
    }

    public int getSavingsDashboardClosingAccountIntervalMs() {
        return this.savingsDashboardClosingAccountIntervalMs;
    }

    public int getSavingsDashboardClosingAccountTimeoutMs() {
        return this.savingsDashboardClosingAccountTimeoutMs;
    }

    public int getSavingsDashboardV4TimeoutMs() {
        return this.savingsDashboardV4TimeoutMs;
    }

    public int getSimplifiedIdStatusIntervalMs() {
        return this.simplifiedIdStatusIntervalMs;
    }

    public int getSimplifiedIdStatusTimeoutMs() {
        return this.simplifiedIdStatusTimeoutMs;
    }

    public int getSplitContractDraftStatusIntervalMs() {
        return this.splitContractDraftStatusIntervalMs;
    }

    public int getSplitContractDraftStatusTimeoutMs() {
        return this.splitContractDraftStatusTimeoutMs;
    }

    public int getSplitDepositTransactionStatusIntervalMs() {
        return this.splitDepositTransactionStatusIntervalMs;
    }

    public int getSplitDepositTransactionStatusTimeoutMs() {
        return this.splitDepositTransactionStatusTimeoutMs;
    }

    public int getTransferStatusAftIntervalMs() {
        return this.transferStatusAftIntervalMs;
    }

    public int getTransferStatusAftTimeoutMs() {
        return this.transferStatusAftTimeoutMs;
    }

    public int getTransferStatusIntervalMs() {
        return this.transferStatusIntervalMs;
    }

    public int getTransferStatusTimeoutMs() {
        return this.transferStatusTimeoutMs;
    }

    public int getUpgradeIntervalMs() {
        return this.upgradeIntervalMs;
    }

    public int getUpgradeTimeoutMs() {
        return this.upgradeTimeoutMs;
    }

    public int getYbCheckIntervalMs() {
        return this.ybCheckIntervalMs;
    }

    public int getYbCheckTimeoutMs() {
        return this.ybCheckTimeoutMs;
    }

    public int hashCode() {
        return this.jsonValues.hashCode();
    }

    public String toString() {
        return nnm.j("PollingConfigsImpl(jsonValues=", Extension.C_BRAKE, this.jsonValues);
    }
}
