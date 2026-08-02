package ru.ok.android.webrtc.protocol.screenshare;

/* loaded from: classes9.dex */
public class ScreensharePacketFlags {
    public volatile byte a;

    public ScreensharePacketFlags() {
        this.a = (byte) 0;
    }

    public byte getFlagValue() {
        return this.a;
    }

    public boolean isEnd() {
        return (this.a & 2) != 0;
    }

    public boolean isEos() {
        return (this.a & 8) != 0;
    }

    public boolean isKeyFrame() {
        return (this.a & 4) != 0;
    }

    public boolean isStart() {
        return (this.a & 1) != 0;
    }

    public void setEnd(boolean z) {
        byte b = this.a;
        if (z) {
            this.a = (byte) (b | 2);
        } else {
            this.a = (byte) (b & (-3));
        }
    }

    public void setEos(boolean z) {
        byte b = this.a;
        if (z) {
            this.a = (byte) (b | 8);
        } else {
            this.a = (byte) (b & (-9));
        }
    }

    public void setFlagValue(byte b) {
        this.a = b;
    }

    public void setKeyFrame(boolean z) {
        byte b = this.a;
        if (z) {
            this.a = (byte) (b | 4);
        } else {
            this.a = (byte) (b & (-5));
        }
    }

    public void setStart(boolean z) {
        byte b = this.a;
        if (z) {
            this.a = (byte) (b | 1);
        } else {
            this.a = (byte) (b & (-2));
        }
    }

    public ScreensharePacketFlags(byte b) {
        this.a = b;
    }
}
