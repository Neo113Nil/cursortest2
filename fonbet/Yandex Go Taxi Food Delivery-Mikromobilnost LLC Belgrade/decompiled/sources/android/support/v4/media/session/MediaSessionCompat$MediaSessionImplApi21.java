package android.support.v4.media.session;

import android.app.PendingIntent;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaMetadata;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.RemoteCallbackList;
import android.os.RemoteException;
import android.support.v4.media.MediaDescriptionCompat;
import android.support.v4.media.MediaMetadataCompat;
import android.support.v4.media.RatingCompat;
import android.support.v4.media.session.IMediaSession;
import android.util.Log;
import android.view.KeyEvent;
import defpackage.cf10;
import defpackage.gf10;
import defpackage.hf10;
import defpackage.ma31;
import defpackage.ny61;
import defpackage.rz31;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes10.dex */
class MediaSessionCompat$MediaSessionImplApi21 implements cf10 {
    MediaSessionCompat$Callback mCallback;
    boolean mCaptioningEnabled;
    final ExtraSession mExtraSession;
    MediaMetadataCompat mMetadata;
    PlaybackStateCompat mPlaybackState;
    List<MediaSessionCompat$QueueItem> mQueue;
    int mRatingType;
    MediaSessionCompat$RegistrationCallbackHandler mRegistrationCallbackHandler;
    hf10 mRemoteUserInfo;
    int mRepeatMode;
    final MediaSession mSessionFwk;
    Bundle mSessionInfo;
    int mShuffleMode;
    final MediaSessionCompat$Token mToken;
    final Object mLock = new Object();
    boolean mDestroyed = false;
    final RemoteCallbackList<IMediaControllerCallback> mExtraControllerCallbacks = new RemoteCallbackList<>();

    public static class ExtraSession extends IMediaSession.Stub {
        private final AtomicReference<MediaSessionCompat$MediaSessionImplApi21> mMediaSessionImplRef;

        public ExtraSession(MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21) {
            this.mMediaSessionImplRef = new AtomicReference<>(mediaSessionCompat$MediaSessionImplApi21);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void addQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void addQueueItemAt(MediaDescriptionCompat mediaDescriptionCompat, int i) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void adjustVolume(int i, int i2, String str) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void fastForward() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public Bundle getExtras() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public long getFlags() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public PendingIntent getLaunchPendingIntent() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public MediaMetadataCompat getMetadata() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public String getPackageName() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public PlaybackStateCompat getPlaybackState() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 != null) {
                return c.b(mediaSessionCompat$MediaSessionImplApi21.mPlaybackState, mediaSessionCompat$MediaSessionImplApi21.mMetadata);
            }
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public List<MediaSessionCompat$QueueItem> getQueue() {
            return null;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public CharSequence getQueueTitle() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getRatingType() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 != null) {
                return mediaSessionCompat$MediaSessionImplApi21.mRatingType;
            }
            return 0;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getRepeatMode() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 != null) {
                return mediaSessionCompat$MediaSessionImplApi21.mRepeatMode;
            }
            return -1;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public Bundle getSessionInfo() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21.mSessionInfo == null) {
                return null;
            }
            return new Bundle(mediaSessionCompat$MediaSessionImplApi21.mSessionInfo);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public int getShuffleMode() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 != null) {
                return mediaSessionCompat$MediaSessionImplApi21.mShuffleMode;
            }
            return -1;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public String getTag() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public ParcelableVolumeInfo getVolumeAttributes() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isCaptioningEnabled() {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            return mediaSessionCompat$MediaSessionImplApi21 != null && mediaSessionCompat$MediaSessionImplApi21.mCaptioningEnabled;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isShuffleModeEnabledRemoved() {
            return false;
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean isTransportControlEnabled() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void next() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void pause() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void play() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromMediaId(String str, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromSearch(String str, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void playFromUri(Uri uri, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepare() throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromMediaId(String str, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromSearch(String str, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void prepareFromUri(Uri uri, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void previous() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rate(RatingCompat ratingCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rateWithExtras(RatingCompat ratingCompat, Bundle bundle) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void registerCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 == null) {
                return;
            }
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            mediaSessionCompat$MediaSessionImplApi21.mExtraControllerCallbacks.register(iMediaControllerCallback, new hf10("android.media.session.MediaController", callingPid, callingUid));
            synchronized (mediaSessionCompat$MediaSessionImplApi21.mLock) {
                try {
                    MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = mediaSessionCompat$MediaSessionImplApi21.mRegistrationCallbackHandler;
                    if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                        mediaSessionCompat$RegistrationCallbackHandler.postCallbackRegistered(callingPid, callingUid);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void release() {
            this.mMediaSessionImplRef.set(null);
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void removeQueueItem(MediaDescriptionCompat mediaDescriptionCompat) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void removeQueueItemAt(int i) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void rewind() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void seekTo(long j) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void sendCommand(String str, Bundle bundle, MediaSessionCompat$ResultReceiverWrapper mediaSessionCompat$ResultReceiverWrapper) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void sendCustomAction(String str, Bundle bundle) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public boolean sendMediaButton(KeyEvent keyEvent) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setCaptioningEnabled(boolean z) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setPlaybackSpeed(float f) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setRepeatMode(int i) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setShuffleMode(int i) throws RemoteException {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setShuffleModeEnabledRemoved(boolean z) {
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void setVolumeTo(int i, int i2, String str) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void skipToQueueItem(long j) {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void stop() {
            throw new AssertionError();
        }

        @Override // android.support.v4.media.session.IMediaSession.Stub, android.support.v4.media.session.IMediaSession
        public void unregisterCallbackListener(IMediaControllerCallback iMediaControllerCallback) {
            MediaSessionCompat$MediaSessionImplApi21 mediaSessionCompat$MediaSessionImplApi21 = this.mMediaSessionImplRef.get();
            if (mediaSessionCompat$MediaSessionImplApi21 == null) {
                return;
            }
            mediaSessionCompat$MediaSessionImplApi21.mExtraControllerCallbacks.unregister(iMediaControllerCallback);
            int callingPid = Binder.getCallingPid();
            int callingUid = Binder.getCallingUid();
            synchronized (mediaSessionCompat$MediaSessionImplApi21.mLock) {
                try {
                    MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = mediaSessionCompat$MediaSessionImplApi21.mRegistrationCallbackHandler;
                    if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                        mediaSessionCompat$RegistrationCallbackHandler.postCallbackUnregistered(callingPid, callingUid);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public MediaSessionCompat$MediaSessionImplApi21(Object obj) {
        if (!(obj instanceof MediaSession)) {
            ny61.g("mediaSession is not a valid MediaSession object");
            throw null;
        }
        MediaSession mediaSession = (MediaSession) obj;
        this.mSessionFwk = mediaSession;
        ExtraSession extraSession = new ExtraSession(this);
        this.mExtraSession = extraSession;
        this.mToken = new MediaSessionCompat$Token(mediaSession.getSessionToken(), extraSession);
        this.mSessionInfo = null;
        setFlags(3);
    }

    public MediaSession createFwkMediaSession(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str);
    }

    @Override // defpackage.cf10
    public MediaSessionCompat$Callback getCallback() {
        MediaSessionCompat$Callback mediaSessionCompat$Callback;
        synchronized (this.mLock) {
            mediaSessionCompat$Callback = this.mCallback;
        }
        return mediaSessionCompat$Callback;
    }

    public String getCallingPackage() {
        try {
            return (String) this.mSessionFwk.getClass().getMethod("getCallingPackage", null).invoke(this.mSessionFwk, null);
        } catch (Exception e) {
            Log.e("MediaSessionCompat", "Cannot execute MediaSession.getCallingPackage()", e);
            return null;
        }
    }

    public hf10 getCurrentControllerInfo() {
        hf10 hf10Var;
        synchronized (this.mLock) {
            hf10Var = this.mRemoteUserInfo;
        }
        return hf10Var;
    }

    public Object getMediaSession() {
        return this.mSessionFwk;
    }

    @Override // defpackage.cf10
    public PlaybackStateCompat getPlaybackState() {
        return this.mPlaybackState;
    }

    public Object getRemoteControlClient() {
        return null;
    }

    public MediaSessionCompat$Token getSessionToken() {
        return this.mToken;
    }

    public boolean isActive() {
        return this.mSessionFwk.isActive();
    }

    public void release() {
        this.mDestroyed = true;
        this.mExtraControllerCallbacks.kill();
        this.mSessionFwk.setCallback(null);
        this.mExtraSession.release();
        this.mSessionFwk.release();
    }

    public void sendSessionEvent(String str, Bundle bundle) {
        this.mSessionFwk.sendSessionEvent(str, bundle);
    }

    public void setActive(boolean z) {
        this.mSessionFwk.setActive(z);
    }

    public void setCallback(MediaSessionCompat$Callback mediaSessionCompat$Callback, Handler handler) {
        synchronized (this.mLock) {
            try {
                this.mCallback = mediaSessionCompat$Callback;
                this.mSessionFwk.setCallback(mediaSessionCompat$Callback == null ? null : mediaSessionCompat$Callback.mCallbackFwk, handler);
                if (mediaSessionCompat$Callback != null) {
                    mediaSessionCompat$Callback.setSessionImpl(this, handler);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void setCaptioningEnabled(boolean r4) {
        /*
            r3 = this;
            boolean r0 = r3.mCaptioningEnabled
            if (r0 == r4) goto L2b
            r3.mCaptioningEnabled = r4
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
        L11:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mExtraControllerCallbacks
            if (r1 < 0) goto L24
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L1f
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L1f
            r2.onCaptioningEnabledChanged(r4)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L21
            goto L21
        L1f:
            r3 = move-exception
            goto L29
        L21:
            int r1 = r1 + (-1)
            goto L11
        L24:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21.setCaptioningEnabled(boolean):void");
    }

    @Override // defpackage.cf10
    public void setCurrentControllerInfo(hf10 hf10Var) {
        synchronized (this.mLock) {
            this.mRemoteUserInfo = hf10Var;
        }
    }

    public void setExtras(Bundle bundle) {
        this.mSessionFwk.setExtras(bundle);
    }

    public void setFlags(int i) {
        this.mSessionFwk.setFlags(i | 3);
    }

    public void setMediaButtonReceiver(PendingIntent pendingIntent) {
        this.mSessionFwk.setMediaButtonReceiver(pendingIntent);
    }

    public void setMetadata(MediaMetadataCompat mediaMetadataCompat) {
        this.mMetadata = mediaMetadataCompat;
        this.mSessionFwk.setMetadata(mediaMetadataCompat == null ? null : (MediaMetadata) mediaMetadataCompat.getMediaMetadata());
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void setPlaybackState(android.support.v4.media.session.PlaybackStateCompat r4) {
        /*
            r3 = this;
            r3.mPlaybackState = r4
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L1b
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L1b
            int r1 = r1 + (-1)
        Ld:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mExtraControllerCallbacks
            if (r1 < 0) goto L20
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L1b
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L1b
            r2.onPlaybackStateChanged(r4)     // Catch: java.lang.Throwable -> L1b android.os.RemoteException -> L1d
            goto L1d
        L1b:
            r3 = move-exception
            goto L34
        L1d:
            int r1 = r1 + (-1)
            goto Ld
        L20:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            android.media.session.MediaSession r3 = r3.mSessionFwk
            if (r4 != 0) goto L2a
            r4 = 0
            goto L30
        L2a:
            java.lang.Object r4 = r4.getPlaybackState()
            android.media.session.PlaybackState r4 = (android.media.session.PlaybackState) r4
        L30:
            r3.setPlaybackState(r4)
            return
        L34:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1b
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21.setPlaybackState(android.support.v4.media.session.PlaybackStateCompat):void");
    }

    public void setPlaybackToLocal(int i) {
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        builder.setLegacyStreamType(i);
        this.mSessionFwk.setPlaybackToLocal(builder.build());
    }

    public void setPlaybackToRemote(rz31 rz31Var) {
        throw null;
    }

    public void setQueue(List<MediaSessionCompat$QueueItem> list) {
        this.mQueue = list;
        if (list == null) {
            this.mSessionFwk.setQueue(null);
            return;
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<MediaSessionCompat$QueueItem> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((MediaSession.QueueItem) it.next().getQueueItem());
        }
        this.mSessionFwk.setQueue(arrayList);
    }

    public void setQueueTitle(CharSequence charSequence) {
        this.mSessionFwk.setQueueTitle(charSequence);
    }

    public void setRatingType(int i) {
        this.mRatingType = i;
    }

    public void setRegistrationCallback(gf10 gf10Var, Handler handler) {
        synchronized (this.mLock) {
            try {
                MediaSessionCompat$RegistrationCallbackHandler mediaSessionCompat$RegistrationCallbackHandler = this.mRegistrationCallbackHandler;
                if (mediaSessionCompat$RegistrationCallbackHandler != null) {
                    mediaSessionCompat$RegistrationCallbackHandler.removeCallbacksAndMessages(null);
                }
                if (gf10Var != null) {
                    this.mRegistrationCallbackHandler = new MediaSessionCompat$RegistrationCallbackHandler(handler.getLooper(), gf10Var);
                } else {
                    this.mRegistrationCallbackHandler = null;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void setRepeatMode(int r4) {
        /*
            r3 = this;
            int r0 = r3.mRepeatMode
            if (r0 == r4) goto L2b
            r3.mRepeatMode = r4
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
        L11:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mExtraControllerCallbacks
            if (r1 < 0) goto L24
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L1f
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L1f
            r2.onRepeatModeChanged(r4)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L21
            goto L21
        L1f:
            r3 = move-exception
            goto L29
        L21:
            int r1 = r1 + (-1)
            goto L11
        L24:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21.setRepeatMode(int):void");
    }

    public void setSessionActivity(PendingIntent pendingIntent) {
        this.mSessionFwk.setSessionActivity(pendingIntent);
    }

    /*  JADX ERROR: NullPointerException in pass: BlockProcessor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.nodes.BlockNode.getPredecessors()" because "to" is null
        	at jadx.core.dex.visitors.blocks.BlockSplitter.connect(BlockSplitter.java:158)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectSplittersAndHandlers(BlockExceptionHandler.java:480)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.wrapBlocksWithTryCatch(BlockExceptionHandler.java:381)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.connectExcHandlers(BlockExceptionHandler.java:90)
        	at jadx.core.dex.visitors.blocks.BlockExceptionHandler.process(BlockExceptionHandler.java:61)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.independentBlockTreeMod(BlockProcessor.java:372)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:56)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:49)
        */
    public void setShuffleMode(int r4) {
        /*
            r3 = this;
            int r0 = r3.mShuffleMode
            if (r0 == r4) goto L2b
            r3.mShuffleMode = r4
            java.lang.Object r0 = r3.mLock
            monitor-enter(r0)
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r1 = r3.mExtraControllerCallbacks     // Catch: java.lang.Throwable -> L1f
            int r1 = r1.beginBroadcast()     // Catch: java.lang.Throwable -> L1f
            int r1 = r1 + (-1)
        L11:
            android.os.RemoteCallbackList<android.support.v4.media.session.IMediaControllerCallback> r2 = r3.mExtraControllerCallbacks
            if (r1 < 0) goto L24
            android.os.IInterface r2 = r2.getBroadcastItem(r1)     // Catch: java.lang.Throwable -> L1f
            android.support.v4.media.session.IMediaControllerCallback r2 = (android.support.v4.media.session.IMediaControllerCallback) r2     // Catch: java.lang.Throwable -> L1f
            r2.onShuffleModeChanged(r4)     // Catch: java.lang.Throwable -> L1f android.os.RemoteException -> L21
            goto L21
        L1f:
            r3 = move-exception
            goto L29
        L21:
            int r1 = r1 + (-1)
            goto L11
        L24:
            r2.finishBroadcast()     // Catch: java.lang.Throwable -> L1f
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            goto L2b
        L29:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L1f
            throw r3
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.v4.media.session.MediaSessionCompat$MediaSessionImplApi21.setShuffleMode(int):void");
    }

    public MediaSessionCompat$MediaSessionImplApi21(Context context, String str, ma31 ma31Var, Bundle bundle) {
        MediaSession createFwkMediaSession = createFwkMediaSession(context, str, bundle);
        this.mSessionFwk = createFwkMediaSession;
        ExtraSession extraSession = new ExtraSession(this);
        this.mExtraSession = extraSession;
        this.mToken = new MediaSessionCompat$Token(createFwkMediaSession.getSessionToken(), extraSession, ma31Var);
        this.mSessionInfo = bundle;
        setFlags(3);
    }
}
