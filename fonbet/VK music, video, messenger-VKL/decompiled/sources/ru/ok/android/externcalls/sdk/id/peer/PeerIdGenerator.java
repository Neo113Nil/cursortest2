package ru.ok.android.externcalls.sdk.id.peer;

import java.util.NoSuchElementException;
import kotlin.random.Random;
import xsna.q500;
import xsna.qz9;
import xsna.zcl;

/* compiled from: PeerIdGenerator.kt */
/* loaded from: classes9.dex */
public final class PeerIdGenerator {
    private static final Companion Companion = new Companion(null);
    private static final long MIN_JS_SAFE_LONG = -9007199254740991L;
    private static final long MAX_JS_SAFE_LONG = 9007199254740991L;
    private static final q500 PEER_ID_RANGE = new q500(MIN_JS_SAFE_LONG, MAX_JS_SAFE_LONG);

    /* compiled from: PeerIdGenerator.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        private Companion() {
        }
    }

    public final long generatePeerId() {
        try {
            return qz9.e(Random.b, PEER_ID_RANGE);
        } catch (IllegalArgumentException e) {
            throw new NoSuchElementException(e.getMessage());
        }
    }
}
