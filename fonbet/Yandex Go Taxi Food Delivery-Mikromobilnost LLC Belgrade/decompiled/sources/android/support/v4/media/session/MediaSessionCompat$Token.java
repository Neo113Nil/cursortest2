package android.support.v4.media.session;

import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.media.session.IMediaSession;
import androidx.versionedparcelable.ParcelImpl;
import defpackage.ma31;
import defpackage.ny61;
import defpackage.sd90;

/* loaded from: classes10.dex */
public final class MediaSessionCompat$Token implements Parcelable {
    public static final Parcelable.Creator<MediaSessionCompat$Token> CREATOR = new Parcelable.Creator<MediaSessionCompat$Token>() { // from class: android.support.v4.media.session.MediaSessionCompat$Token.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaSessionCompat$Token createFromParcel(Parcel parcel) {
            return new MediaSessionCompat$Token(parcel.readParcelable(null));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public MediaSessionCompat$Token[] newArray(int i) {
            return new MediaSessionCompat$Token[i];
        }
    };
    private IMediaSession mExtraBinder;
    private final Object mInner;
    private final Object mLock;
    private ma31 mSession2Token;

    public MediaSessionCompat$Token(Object obj, IMediaSession iMediaSession, ma31 ma31Var) {
        this.mLock = new Object();
        this.mInner = obj;
        this.mExtraBinder = iMediaSession;
        this.mSession2Token = ma31Var;
    }

    public static MediaSessionCompat$Token fromBundle(Bundle bundle) {
        if (bundle == null) {
            return null;
        }
        bundle.setClassLoader(MediaSessionCompat$Token.class.getClassLoader());
        IMediaSession asInterface = IMediaSession.Stub.asInterface(bundle.getBinder("android.support.v4.media.session.EXTRA_BINDER"));
        ma31 e = sd90.e(bundle);
        MediaSessionCompat$Token mediaSessionCompat$Token = (MediaSessionCompat$Token) bundle.getParcelable("android.support.v4.media.session.TOKEN");
        if (mediaSessionCompat$Token == null) {
            return null;
        }
        return new MediaSessionCompat$Token(mediaSessionCompat$Token.mInner, asInterface, e);
    }

    public static MediaSessionCompat$Token fromToken(Object obj, IMediaSession iMediaSession) {
        if (obj != null) {
            if (obj instanceof MediaSession.Token) {
                return new MediaSessionCompat$Token(obj, iMediaSession);
            }
            ny61.g("token is not a valid MediaSession.Token object");
        }
        return null;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MediaSessionCompat$Token)) {
            return false;
        }
        Object obj2 = this.mInner;
        Object obj3 = ((MediaSessionCompat$Token) obj).mInner;
        if (obj2 == null) {
            return obj3 == null;
        }
        if (obj3 == null) {
            return false;
        }
        return obj2.equals(obj3);
    }

    public IMediaSession getExtraBinder() {
        IMediaSession iMediaSession;
        synchronized (this.mLock) {
            iMediaSession = this.mExtraBinder;
        }
        return iMediaSession;
    }

    public ma31 getSession2Token() {
        ma31 ma31Var;
        synchronized (this.mLock) {
            ma31Var = this.mSession2Token;
        }
        return ma31Var;
    }

    public Object getToken() {
        return this.mInner;
    }

    public int hashCode() {
        Object obj = this.mInner;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public void setExtraBinder(IMediaSession iMediaSession) {
        synchronized (this.mLock) {
            this.mExtraBinder = iMediaSession;
        }
    }

    public void setSession2Token(ma31 ma31Var) {
        synchronized (this.mLock) {
            this.mSession2Token = ma31Var;
        }
    }

    public Bundle toBundle() {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.support.v4.media.session.TOKEN", this);
        synchronized (this.mLock) {
            try {
                IMediaSession iMediaSession = this.mExtraBinder;
                if (iMediaSession != null) {
                    bundle.putBinder("android.support.v4.media.session.EXTRA_BINDER", iMediaSession.asBinder());
                }
                ma31 ma31Var = this.mSession2Token;
                if (ma31Var != null) {
                    Bundle bundle2 = new Bundle();
                    bundle2.putParcelable("a", new ParcelImpl(ma31Var));
                    bundle.putParcelable("android.support.v4.media.session.SESSION_TOKEN2", bundle2);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bundle;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable((Parcelable) this.mInner, i);
    }

    public MediaSessionCompat$Token(Object obj, IMediaSession iMediaSession) {
        this(obj, iMediaSession, null);
    }

    public MediaSessionCompat$Token(Object obj) {
        this(obj, null, null);
    }

    public static MediaSessionCompat$Token fromToken(Object obj) {
        return fromToken(obj, null);
    }
}
